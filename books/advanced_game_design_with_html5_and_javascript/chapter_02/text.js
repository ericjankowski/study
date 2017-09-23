let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

let content = "Hello, World!"

ctx.font = "24px 'Rockwell Extra Bold', 'Futura', sans-serif";
ctx.fillStyle = "red";

let width = ctx.measureText(content).width;
let height = ctx.measureText("M").width;

ctx.textBaseline = "middle";  //top, hanging, middle, alphabetic, ideographic, bottom

ctx.fillText(
	content, 
	canvas.width / 2 - width / 2,
	canvas.height /2 - height / 2
);