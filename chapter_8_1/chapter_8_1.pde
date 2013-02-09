Circle myCircle;

void setup(){
	size(400, 400);
	background(255);
	myCircle = new Circle();
}

void draw(){
}

void mousePressed(){
	myCircle.display();
}

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