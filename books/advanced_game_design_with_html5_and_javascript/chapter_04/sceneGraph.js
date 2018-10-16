console.log("sceneGraph.js");

let rectangle = function(
	width = 32,
	height = 32, 
	fillStyle = "gray",
	strokeStyle = "none", 
	lineWidth = 0,
	x = 0,
	y = 0
) {
	let o = {};
	Object.assign(
		o,
		{width, height, fillStyle, strokeStyle, lineWidth, x, y}
	);
	