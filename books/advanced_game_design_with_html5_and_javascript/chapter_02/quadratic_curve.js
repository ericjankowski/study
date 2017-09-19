let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

ctx.stokeStyle = "black";
ctx.lineWidth = 3;
ctx.beginPath();
ctx.moveTo(32, 128);
ctx.quadraticCurveTo(128, 20, 224, 128);
ctx.stroke();