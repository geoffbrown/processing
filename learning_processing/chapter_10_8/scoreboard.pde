class Scoreboard {

	Box[] boxes;

	int x;
	int y;
	int w; 
	int m;
	color c;

	int totalTries; // reset variable that stayes the total number of tries
	int count; // count down variable

	// constructor 1 that only takes total number of tries
	Scoreboard(int totalTries_) {
		totalTries = totalTries_;
		count = 0;
		boxes = new Box[totalTries_];
		
	}

	// constructor 1 that gives count handicap
	Scoreboard(int totalTries_, int count_) {
		totalTries = totalTries_;
		count = count_;	
	}

	void removeTry() {
		count++;
		// boxes[count].changeColor();
	}

	boolean gameOver() {
		if (count >= totalTries){
			//println("GAME OVER!!!!!");
			count = totalTries;
			return true;
		} else {
			return false;
		}
	}

	void displayBoxes(int w_, int m_, color c_){
		x = 0;
		y = 0;
		w = w_;
		m = m_;
		c = c_;

		for (int i = 0; i<(totalTries-count); i++){	
			boxes[i] = new Box(x,y,w,color(c));
			boxes[i].display();
			x = (x + w) + m;
		}
	}


}