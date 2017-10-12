console.log("sprite.js");

let canvas = document.createElement("canvas");
canvas.setAttribute("width", "256");
canvas.setAttribute("height", "256");
canvas.style.border = "1px dashed black";
document.body.appendChild(canvas);
let ctx = canvas.getContext("2d");

let children = [];

let rectangle = function(
	width = 32,
	height = 32, 
	fillStyle = "gray",
	strokeStyle = "none", 
	lineWidth = 0,
	x = 0,
	y = 0
) {
	let o = {};
	Object.assign(
		o,
		{width, height, fillStyle, strokeStyle, lineWidth, x, y}
	);

	o.rotation = 0;
	o.alpha = 1;
	o.visible = true;
	o.scaleX = 1;
	o.scaleY = 1;

	o.vx = 0;
	o.vy = 0;

	o.render = ctx => {
		ctx.strokeStyle = o.strokeStyle;
		ctx.lineWidth = o.lineWidth;
		ctx.fillStyle = o.fillStyle;
		ctx.beginPath();
		ctx.rect(-o.width / 2, -o.height / 2, o.width, o.height);
		if (o.strokeStyle !== "none"){
			ctx.stroke();
		}
		ctx.fill();
	};

	children.push(o);

	return o;
};

function render (canvas, ctx) {
	ctx.clearRect(0, 0, canvas.width, canvas.height);

	children.forEach(sprite => {
		displaySprite(sprite);
	});

	function displaySprite(sprite) {
		if (sprite.visible) {
			ctx.save();
			ctx.translate(
				sprite.x + sprite.width / 2,
				sprite.y + sprite.height / 2
			);

			ctx.rotate(sprite.rotation);
			ctx.globalAlpha = sprite.alpha;
			ctx.scale(sprite.scaleX, sprite.scaleY);

			sprite.render(ctx);

			ctx.restore();
		}
	}
}

let blueBox = rectangle(64, 64, "blue", "none", 0, 32, 32);
blueBox.rotation = 0.2;

let redBox = rectangle(64, 64, "red", "black", 4, 160, 100);
redBox.alpha = 0.5;
redBox.scaleY = 2;

let greenBox = rectangle(64, 64, "yellowGreen", "black", 2, 50, 150);
greenBox.scaleX = 0.5;
greenBox.rotation = 0.8;

render(canvas, ctx);


