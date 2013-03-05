Drop[] drops = new Drop[1000];

int totalDrops = 0;

void setup(){
	size(400, 400);
	smooth();

}

void draw(){
	background(255);

	// initialize one drop
	drops[totalDrops] = new Drop();

	// increment totalDrops
	totalDrops++;

	//if we hit the end of the array
	if (totalDrops >= drops.length){
		totalDrops = 0; // start over
	}


	for (int i = 0; i<totalDrops; i++){
		drops[i].display();
		drops[i].move();
	}

}