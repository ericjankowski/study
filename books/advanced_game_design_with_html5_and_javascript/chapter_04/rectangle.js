let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

ctx.strokeStyle = "black";
ctx.lineWidth = 3;
ctx.fillStyle = "rgba(128, 128, 128, 1)";
ctx.save();
ctx.globalAlpha = 0.5;
ctx.translate(128, 128);
ctx.rotate(0.5);
ctx.beginPath();
ctx.rect(-64, -64, 128, 128);
ctx.closePath();
ctx.stroke();
ctx.fill();
ctx.restore();