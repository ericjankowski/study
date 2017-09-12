let words = ["fun", "boring", "exciting"];
let betterWords = words.map(improveGrammar);

function improveGrammar(word){
	return word + "ish";
}

console.log(betterWords);