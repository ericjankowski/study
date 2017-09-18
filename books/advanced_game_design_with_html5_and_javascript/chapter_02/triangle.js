let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

ctx.strokeStyle = "black";
ctx.lineWidth = 6;
ctx.lineJoin = "round";
ctx.fillStyle = "rgba(128, 128, 128, 0.5)";

ctx.beginPath();
ctx.moveTo(128, 10);
ctx.lineTo(170, 95);
ctx.lineTo(85, 95);
ctx.lineTo(128, 10);
ctx.fill();
ctx.stroke();

let triangle = [
	[128, 115],
	[170, 200],
	[85, 200]
];

function drawPath(shape){
	let lastPoint = shape.length -1;
	ctx.moveTo(
		shape[lastPoint][0],
		shape[lastPoint][1]
	);

	shape.forEach(point => {
		ctx.lineTo(point[0], point[1]);
	});
}

ctx.beginPath();
drawPath(triangle);
ctx.lineJoin = "round";
ctx.stroke();
ctx.fill();