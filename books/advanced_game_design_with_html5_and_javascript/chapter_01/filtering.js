let numbers = [11, 43, 9, 112, 64, 312, 92];

let bigNumbers = numbers.filter(findBigNumbers);

function findBigNumbers (number){
	return number > 100;
}

console.log(numbers);
console.log(bigNumbers);

numbers = numbers.filter(x => x < 100);

console.log(numbers);