let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

ctx.fillStyle = "black";

ctx.save();
ctx.beginPath();
ctx.globalAlpha = 0.6;
ctx.rect(32, 32, 128, 128);
ctx.fill();
ctx.restore();

ctx.save();
ctx.beginPath();
ctx.globalAlpha = 0.3;
ctx.arc(160, 160, 64, 0, Math.PI * 2, false);
ctx.fill();
cts.restore();