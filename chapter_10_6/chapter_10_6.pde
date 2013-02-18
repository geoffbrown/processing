Drop[] drops = new Drop[50];

void setup(){
	size(400, 400);
	smooth();
	for (int i = 0; i<drops.length; i++){
		drops[i] = new Drop();
	}
}

void draw(){
	background(255);
	for (int i = 0; i<drops.length; i++){
		drops[i].display();
		drops[i].move();
	}

}