let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");


ctx.stokeStyle = "black";
ctx.lineWidth = 3;
ctx.beginPath();
ctx.arc(128, 128, 64, 3.14, 5, false);
ctx.stroke();


ctx.beginPath();
ctx.arc(188, 128, 64, 3.14, 5, false);
ctx.stroke();