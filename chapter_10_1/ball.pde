class Ball
{
	
	float r;				// radius of the ball
	float x,y;				// location
	float xspeed, yspeed; 	// speed

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Ball (float r_, float speed_) {
		// expression
		r = r_;
		x = random(0, width);
		y = random(0, height);
		xspeed = speed_;
		yspeed = speed_;
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

	void display(){
		stroke(0);
		fill(0,50);
		ellipse(x, y, r*2, r*2);
	}
}