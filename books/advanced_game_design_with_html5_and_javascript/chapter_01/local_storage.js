let anyNumber = 34;
localStorage.setItem("data", anyNumber);

let loadedData = localStorage.getItem("data");
loadedData = parseInt(loadedData);
console.log(loadedData);

let gameData = {
	playerName: "Rex",
	levelCompleted: 5,
	score: 84,
	items: ["hat", "umbrella", "katana"]
};
let gameDataJSON = JSON.stringify(gameData);
localStorage.setItem("gameData", gameDataJSON);

loadedData = localStorage.getItem("gameData");
let data = JSON.parse(loadedData);

console.log(data);