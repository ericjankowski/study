let rooms = {};

let xhr = new XMLHttpRequest();
xhr.open("GET", "rooms.json", true);
xhr.responseType = 'text';
xhr.onload = event => {
	if (xhr.status === 200){
		rooms = JSON.parse(xhr.responseText);
		console.log("JSON data loaded");

		console.log(rooms.livingRoom.contents);

		if(rooms.closet.light.on === false){
			console.log("The closet light is off");
		}
	}
};

xhr.send();

console.log("Second Test");