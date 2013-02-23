Catcher catcher;				// one catcher object
Timer timer;					// one timer object
Drop[] drops;					// an array of drop objects

int totalDrops = 0;				// totalDrops


void setup(){
	size(400, 400);
	noStroke();
	catcher = new Catcher(32);	// create catcher w/ radius of 32
	drops = new Drop[1000];		// create 1k spots in the array
	timer = new Timer(300);	// create a 2 sec timer

	timer.start();				// starts the timer

}

void draw(){
	background(255);

	catcher.setLocation(mouseX, mouseY);	// set catcher loc
	catcher.display();						// display catcher

	// check the timer
	if(timer.isFinished()) {

		// deal with raindrops
		// initialize one drop
		drops[totalDrops] = new Drop();

		// increment totalDrops
		totalDrops++;

		//if we hit the end of the array
		if (totalDrops >= drops.length){
			totalDrops = 0; // start over
		}

		timer.start();
	}

	

	for (int i = 0; i<totalDrops; i++){
		drops[i].display();
		drops[i].move();
		if (catcher.intersect(drops[i])){
			drops[i].caught();
		}
	}

}