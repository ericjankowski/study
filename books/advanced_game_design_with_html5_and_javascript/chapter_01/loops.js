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

let numbers = [1, 2, 3, 4, 5];
let squared = [for (let x of numbers) x * x];
console.log(squared);