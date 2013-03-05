float r = 150;
float g = 0;
float b = 0;

void setup(){
	size(200, 200);
}

void draw(){
	background(r, g, b);
	stroke(255);
	line(width/2, 0, width/2, height); // draw a line to spit the screen in left/right sections
	line(0, height/2, width, height/2);

	if(mouseX > width/2) {
		r = r + 1;
	} else {
		r = r - 1;
	}

	if(mouseY > height/2) {
		b = b + 1;
	} else {
		b = b - 1;
	}

	if (mousePressed) {
		g = g + 1;
	} else {
		g = g - 1;
	}

	if (mouseX > width/2 && mouseY > height/2) { // if the mouse is on the right side and on the bottom
		fill(255);
		rect(width/2, height/2, width/2, height/2); // draw a rect that fills the lower right side with white 
		/* note: this gets painted over because of the background function in draw */
	}

	r = constrain(r, 0, 255); // constrain r to be no lower than 0 and no higher than 255
	g = constrain(g, 0, 255); // constrain g to be no lower than 0 and no higher than 255
	b = constrain(b, 0, 255); // constrain b to be no lower than 0 and no higher than 255
}

