let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

ctx.stokeStyle = "black";
ctx.lineWidth = 3;
ctx.fillStyle = "rgba(128, 128, 128, 0.5)";
ctx.save();

ctx.translate(128, 128);

ctx.rotate(Math.PI / 4);

ctx.beginPath();
ctx.rect(-64, -64, 128, 128);
ctx.stroke();
ctx.fill();

cts.restore();