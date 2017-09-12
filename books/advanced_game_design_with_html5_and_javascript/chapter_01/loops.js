let planets = ["jupiter", "venus", "saturn", "mars"];
for (let i=0; i < planets.length; i++){
	planet = planets[i];
	console.log(planet);
}

console.log("----------");

planets.forEach(displayElements);

console.log("----------");

planets.forEach(displayElementsWithIndex);

function displayElements(element){
	console.log(element);
}

function displayElementsWithIndex(element, i){
	console.log(i + ": " + element);
}

console.log("----------");

planets.forEach((planet) =>{
	console.log(planet);
});

console.log("----------");

//let numbers = [1, 2, 3, 4, 5];
//var doubled = [for (i of numbers) i * 2];
//console.log(doubled);
//let squared = [for (x of numbers) x * x];
//console.log(squared);

let room = {
	door: "open",
	light: "on",
	contents: ["carpet", "mouse", "katana"]
};

console.log(Object.keys(room));
console.log("----------");
Object.keys(room).forEach(key => {
	let value = room[key];
	console.log("key: " + key + ", value: " + value);
});

console.log("----------");

let roomProperties = Object.keys(room);
for (let key of roomProperties){
	let value = room[key];
	console.log("key: " + key + ", value: " + value);
}

console.log("----------");

let instruments = ["guitsr", "piano", "tabla", "ocarina", "tabla"];
instruments.some(find);
function find(instrument){
	if(instrument === "tabla"){
		console.log("Table found!");
		return true;
	} else {
		console.log("No tabla found...");
		return false;
	}
}

let found = instruments.find(x => x === "tabla");
console.log(found);

let index = instruments.findIndex(x => x === "tabla");
console.log(index);