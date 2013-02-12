class Ball {
	color c; // initialize color

	float w; // initialize width
	float h; // initialize height

	float xpos; // initialize x postion
	float ypos; // initialize y position
	float speed; // initialize speed
	float grav; // initialize grav

	float setX;
	float setY;

	float initSpeed; // initialize the stored value of speed for resetting
	float initGrav; // initialize the stored value of grav for resetting

	Ball(color tempC, float tempW, float tempH, float tempSpeed, float tempGrav) {
		c = tempC;
		w = tempW;
		h = tempH;

		// store initial values as their own variable
		initSpeed = tempSpeed;
		initGrav = tempGrav;
		
		// pass in speed and grav
		speed = tempSpeed;
		grav = tempGrav;
	}

	// reset the ball location
	void resetBall(float pSetX, float pSetY){
		setX = pSetX;
		setY = pSetY;
		ellipse(setX, setY, w, h);
	}

	// creates a display method that's run on draw();
	void display(){
		noStroke();
		fill(c);
		rectMode(CENTER);
		ellipse(xpos, ypos, w, h); // create the dropping ball

	}

	// sets the values of the ball to drop, and resets grav + speed
	void setPos(float tempXpos, float tempYpos) {
		// reset grav and speed
		grav = initGrav;
		speed = initSpeed;

		// set the x and ypos via the method call
		xpos = tempXpos;
		ypos = tempYpos;
	}

	// draw it out and make it bounce
	void update() {		
		speed += grav;
		ypos += speed;
		if (ypos>height - h/2){
			ypos = height - h/2;
			speed = speed *-0.95;
		}
	}
}