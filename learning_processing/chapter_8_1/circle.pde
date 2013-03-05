class Circle
{
	color c;
	int xpos;
	int ypos;


	int w;
	int h;

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Circle() {
		c = color(0);
		w = 50;
		h = 50;
	}

	void display() {
		xpos = mouseX;
		ypos = mouseY;
		ellipseMode(CENTER);
		fill(c);
		noStroke();
		ellipse(xpos, ypos, w, h);
	}
}