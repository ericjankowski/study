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
ctx.rect(50, 40, 70, 90);
ctx.stroke();
ctx.fill();

ctx.strokeStyle = "red";
ctx.lineWidth = 6;
ctx.fillStyle = "rgba(128, 128, 128, 0.5";
ctx.strokeRect(110, 170, 100, 50);
ctx.fillRect(110, 170, 100, 50);