void setup(){
	size(800, 800); // make the size of the screen 200x200
	background(255); // make the bg white
	smooth(); // smooth 
}

void draw(){
	
	stroke(0); // make the stroke black

	/* The speed of the mouse's horizontal motion is the absolute value of of
	difference between the mouseX and pmouseX */

	strokeWeight(abs(mouseX-pmouseX)); // determine the stroke weight

	line(pmouseX, pmouseY, mouseX, mouseY);
	/* Draw a line from the previous mouse x,y to the current x,y */

}
