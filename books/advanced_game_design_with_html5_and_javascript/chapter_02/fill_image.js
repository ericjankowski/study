let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

let basketballImage = new Image();
basketballImage.addEventListener("load", loadHandler, false);
basketballImage.src = "../images/basketball.png";

function loadHandler(){
	ctx.strokeStyle = "black";
	ctx.lineWidth = 3;
	ctx.beginPath();
	ctx.rect(64, 64, 128, 128);

	let pattern = ctx.createPattern(basketballImage, "no-repeat");
	ctx.fillStyle = pattern;

	ctx.save();
	ctx.translate(64, 64);
	ctx.stroke();
	ctx.fill();
	ctx.restore();
}