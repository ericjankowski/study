let jar = {};

Object.defineProperty(jar, "cookies",{
	get(){
		return this.value;
	},
	set(newValue){
		if(newValue >= 0 && newValue <= 100){
			this.value = newValue;
		} else {
			throw new Error("Please use a number between 0 and 100");
		}
	},
	enumerable: true,
	configurable: true
});

jar.cookies = 10;
console.log(jar.cookies);

jar.cookies = 15;
console.log(jar.cookies);

jar.cookies += 5;
console.log(jar.cookies);

console.log("----------");

let bird = {
	legs: 2,
	eyes: 2,
	speak(){
		console.log("Chirp!");
	}
}

console.log(`This bird has ${bird.eyes} eyes`);
bird.speak();

console.log("----------");

function animal() {
	return {
		legs: 4,
		eyes: 2,
		say: "Huh?",
		speak() {
			console.log(this.say);
		}
	};
}

var cat = animal();
cat.speak();
cat.say = "Meow!";
cat.speak();

let otherBird = animal();
otherBird.say = "Chirp!";
otherBird.speak();
cat.speak();

console.log("----------");

function otherAnimal(){
	let newObject, words;
	function random(min, max){
		return Math.floor(Math.random() * (max - min + 1)) + min;
	}

	words = ["Food!", "Sleep!", "Video games!"];

	function speak(){
		let say = words[random(0,2)];
		console.log(say);
	}

	newObject = {};
	newObject.speak = speak;

	return newObject;
}

let otherCat = otherAnimal();
otherCat.speak();

console.log("----------");

function robot() {
	return {
		skill: "vaporizing death ray"
	};
}

function human() {
	return {
		hobby: "bake cookies"
	};
}

function cyborg(){
	let newObject = {};
	Object.assign(newObject, robot());
	Object.assign(newObject, human());

	function speak() {
		console.log("I like to " + this.hobby + " using a " + this.skill);
	}

	newObject.speak = speak;

	return newObject;
}

let zxlorb = cyborg();
zxlorb.speak();