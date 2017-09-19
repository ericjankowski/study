let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

ctx.globalCompositeOperation = "multiply";

ctx.save();
ctx.fillStyle = "red";
ctx.beginPath();
ctx.rect(32, 32, 128, 128);
ctx.fill();
ctx.restore();

ctx.save();
ctx.fillStyle = "blue";
ctx.beginPath();
ctx.arc(160, 160, 64, 0, Math.PI * 2, false);
ctx.fill();
cts.restore();