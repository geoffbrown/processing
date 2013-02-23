class Drop {
	float x,y;			// location of raindrops
	float speed;		// speed
	color c;			// color of raindrop
	float r;			// radius

	Drop() {
		r = 16;					// all raindrops are the same size
		x = random(width);		// start with a random x loc
		y = -r*4;				// begin above the window
		speed = random(1,5);	// pick rando speed between 1 and 5
		c = color(50,100,150);	// make the drop blue
	}

	void display(){
	
		// ellipse(x, y, r, r);

		for (int i = 2; i<8; i++){
			fill(c);
			noStroke();
			ellipse(x, y+i*4, i*2, i*2);
		}
	}

	void move() {
		y += speed;				// increment by speed!
	}

	boolean reachedBottom(){
		if (y>height + r*4){
			return true;
		} else {
			return false;
		}
	}

	void caught() {
		speed = 0;
		y = -1000;
		println("got that fukr");
	}
}