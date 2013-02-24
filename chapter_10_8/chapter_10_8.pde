Catcher catcher;				// one catcher object
Timer timer;					// one timer object
Drop[] drops;					// an array of drop objects

Scoreboard scoreboard;			// one scoreboard object

int totalDrops = 0;				// totalDrops


void setup(){
	size(400, 400);
	noStroke();
	catcher = new Catcher(32);			// create catcher w/ radius of 32
	drops = new Drop[1000];				// create 1k spots in the array
	timer = new Timer(200);				// create a 2 sec timer
	
	scoreboard = new Scoreboard(10);		// create a scoreboard obj with n tries	
	timer.start();						// starts the timer

}

void draw(){


	background(255);
	
	// creates the visual scoring system with the following sizes + margins
	scoreboard.displayBoxes(30,5,200);		// set up display parameters --> width, margin, color
	catcher.setLocation(mouseX, mouseY);	// set catcher loc
	catcher.display();						// display catcher

	isGameOver();
	checkTimer();
	detectDrops();
}

void isGameOver(){
	if (scoreboard.gameOver()){
		for (int i = 0; i<totalDrops; i++){
			drops[i].caught();
		}
	}
}

void checkTimer(){
// check the timer
	if (timer.isFinished()) {

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
}

void detectDrops(){
		for (int i = 0; i<totalDrops; i++){
		drops[i].display();
		drops[i].move();
		if (catcher.intersect(drops[i])){
			drops[i].caught();

		}
		if (drops[i].reachedBottom()){
			drops[i].missed();
		}

	}
}