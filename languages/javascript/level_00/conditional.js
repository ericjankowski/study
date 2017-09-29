let colors = ["red", "orange", "yellow", "green", "blue"];

colors.forEach(color => {
	if(color === "green"){
		console.log(color + " means Go!");
	} else if (color === "red") {
		console.log(color + " means Stop!");
	} else {
		console.log(color);
	}
});
