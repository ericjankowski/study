let canvas = document.createElement("canvas");
canvas.setAttribute("width", "512");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");


ctx.strokeStyle = "black";
ctx.lineWitch = 3;
let gradient = ctx.createLinearGradient(64, 64, 192, 192);
gradient.addColorStop(0, "white");
gradient.addColorStop(1, "black");
ctx.fillStyle = gradient;

ctx.beginPath();
ctx.rect(64, 64, 128, 128);
ctx.stroke();
ctx.fill();
