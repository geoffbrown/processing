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

	/* if the mouse is on the right side of the scree, up the R value to make the screen redder.
	if the mouse is on the left side, lower the red down to black. */

	if(mouseX > width/2) {
		r = r + 1;
	} else {
		r = r - 1;
	}

	r = constrain(r, 0, 255); // constrain r to be no lower than 0 and no higher than 255
}
