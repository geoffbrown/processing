class Zoog {
	// Zoog's variables
	float x,y,w,h,eyesize;

	//Zoog's constructor
	Zoog(float tempX, float tempY, float tempW, float tempH, float tempEyeSize) {
		x = tempX;
		y = tempY;
		w = tempW;
		h = tempH;
		eyesize = tempEyeSize;
	}

	void jiggle(float speed){
		// change zoogs location randomly
		x = x + random(-1,1)*speed;
		y = y + random(-1,1)*speed;

		// constrain zoog to window
		x = constrain(x, 0, width);
		y = constrain(y, 0, width);
	}

	void display(){
		ellipseMode(CENTER);
		rectMode(CENTER);

		// draw zoog's arms with a for loop

		for (float i = y - h/3; i<y+h/2; i+=10){
			stroke(0);
			line(x-w/4, i, x+w/4, i);
		}

		// draw zoogs body
		stroke(0);
		fill(175);
		rect(x,y,w/6,h);

		//draw zoog's head
		stroke(0);
		fill(255);
		ellipse(x,y-h, w, h);

		// zoog's eyes
		fill(0);
		ellipse(x-w/3, y-h,eyesize,eyesize*2);
		ellipse(x+w/3, y-h,eyesize,eyesize*2);

		// zoog's legs
		stroke(0);
		line(x-w/12,y+h/2,x-w/4,y+h/2+10);
		line(x+w/12,y+h/2,x+w/4,y+h/2+10);

	}
}