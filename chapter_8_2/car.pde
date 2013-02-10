class Car {
	color c;
	float xpos;
	float ypos;
	float xspeed;

	Car(color tempC, float tempXpos, float tempYpos, float tempXspeed) {
		c = tempC;
		xpos = tempXpos;
		ypos = tempYpos;
		xspeed = tempXspeed;
	}

	void display(){
		stroke(0);
		fill(c);
		rectMode(CENTER);
		rect(xpos, ypos, 20, 10);
	}

	void move(){
		xpos = xpos + xspeed;
		if (xpos > width){
			xpos = 0;
		}
	}
}