class Stripe
{

	float x;		// horizontal location of stripe
	float speed;	// speed of stripe
	float w;		// width of stripe
	boolean mouse; 	// state of stripe (mouse over or not?)
	
	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Stripe() {
		x = 0;					// all stripes start at 0
		speed = random(1);		// all stripes have a random positive speed
		w = random(10,30);		// wide gets random num between 10-30
		mouse = false;			// mouse bool starts off false
	}
	

	// Draw stripe

	void display() {
		// what to display
		if (mouse){
			fill(255);
		}else {
			fill(255,100);
		}
		noStroke();
		rect(x, 0, w, height);
	}

	void move() {
		// what to move
		x += speed;
		if (x>width+20) x = -20;

	}

	void rollover(int mx, int my) {
		// left edge is x, right edge is x+w
		if (mx > x && mx < x + w){
			mouse = true;
		} else {
			mouse = false;
		}
	}
}