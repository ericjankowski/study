let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

ctx.strokeStyle = "black";
ctx.lineWidth = 6;
ctx.lineCap = "round";
ctx.beginPath();
ctx.moveTo(44,64);
ctx.lineTo(172, 192);
ctx.stroke();

ctx.lineCap = "round";
ctx.moveTo(84,64);
ctx.lineTo(212, 192);
ctx.stroke();

ctx.closePath();
