class Ball
{
	
	float r;					// radius of the ball
	float x,y;					// location
	float xspeed, yspeed; 		// speed
	color c = color(100,50);	// color
	color cLock = color(100,50);

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Ball (float r_) {
		// expression
		r = r_;
		x = random(0, width);
		y = random(0, height);
		xspeed = random(-5,5);
		yspeed = random(-5,5);
	}

	void move(){
		x += xspeed;
		y += yspeed;

		if (x > width || x < 0){
			xspeed *= -1;
		}

		if (y > height || y < 0){
			yspeed *= -1;
		}
	}

	void highlight() {
		c = color(0,150);
	}

	void display(){
		noStroke();
		fill(c);
		ellipse(x, y, r*2, r*2);
		c = cLock;
	}

	boolean intersect(Ball b) {
		float distance = dist(x, y, b.x, b.y);
		if (distance < r + b.r){
			return true;
		} else {
			return false;
		}
	}
}