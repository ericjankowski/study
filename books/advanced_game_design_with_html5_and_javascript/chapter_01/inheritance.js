class Monster {
	constructor(hitPoints, scariness) {
		this.name = "Monster";
		this.hitPoints = hitPoints;
		this.scariness = scariness;
	}
	speak() {
		console.log(`I am a ${this.scariness} scary ${this.name} with ${this.hitPoints} hit points`);
	}
	attack(skill) {
		console.log(`The ${this.name} attacks with ${skill}!`);
	}
}

class Dragon extends Monster{
	constructor(hitPoints, scariness, weapon) {
		super(hitPoints, scariness);
		this.name = "Dragon";
		this.weapon = weapon;
	}
	breatheFire() {
		super.attack(`flaming ${this.weapon}`)
	}
}

let fluffy = new Dragon(10, "somewhat", "furballs");
fluffy.speak();
fluffy.breatheFire();