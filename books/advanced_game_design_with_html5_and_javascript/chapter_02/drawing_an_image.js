let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

let basketballImage = new Image();
basketballImage.addEventListener("load", loadHandler, false);
basketballImage.src = "../images/basketball.png";

function loadHandler(){
	ctx.drawImage(basketballImage, 0, 0);
}