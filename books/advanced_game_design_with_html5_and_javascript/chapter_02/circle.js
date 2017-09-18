let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");


ctx.stokeStyle = "black";
ctx.lineWidth = 0.125;
let gradient = ctx.createRadialGradient(96, 96, 12, 128, 128, 96);
gradient.addColorStop(0, "red");
gradient.addColorStop(1, "black");
ctx.fillStyle = gradient;

ctx.beginPath();
ctx.arc(128, 128, 64, 0, 2*Math.PI, false);
ctx.stroke();
ctx.fill();