let anyValue = 4;
let say = "hello";
let outer = "An outer variable";

if (say === "hello"){
	let say = "goodbye";
	console.log(say);
	console.log(outer);
	let inner = "An inner variable";
	console.log(inner);
}
console.log(say);
console.log(inner);