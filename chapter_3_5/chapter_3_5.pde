void setup(){
	size(200, 200); // make the size of the screen 200x200
	background(255); // make the bg white
	smooth(); // smooth 
}

void draw(){
	stroke(0); // make the stroke black
	line(pmouseX, pmouseY, mouseX, mouseY);
	/* Draw a line from the previous mouse x,y to the current x,y */

}