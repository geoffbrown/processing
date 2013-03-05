class Ball {
	color c;		// color
	float x;		// xpos
	float y;		// ypos
	float w;		// width
	float speed;	// speed
	float grav;		// gravity

	Ball(color c_, float w_, float speed_, float grav_){
		c = c_;
		w = w_;
		speed = speed_;
		grav = grav_;
	}

	void display() {
		ellipseMode(CENTER);
		fill(c);
		ellipse(x, y, w, w);
	}

	void setPosition(float x_, float y_) {
		x = x_;
		y = y_;

	}
}