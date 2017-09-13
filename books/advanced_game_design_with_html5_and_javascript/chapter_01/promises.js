function wait(duration = 0) {
	return new Promise(resolve => setTimeout(resolve, duration));
}

wait(1000)
	.then(() => console.log("One"))
	.then(() => wait(1000))
	.then(() => console.log("Two"))
	.then(() => wait(1000))
	.then(() => console.log("Three"))