int circleX = 100;
int circleY = 100;
// int pWidth = 50;
// int pHeight = 50;



void setup(){
	size(200, 200);
}

void draw(){

	int pWidth = mouseX;
	int pHeight = mouseY;

		background(255);
		stroke(0);
		fill(175);
		ellipse(mouseX, mouseY, pWidth, pHeight);

		// circleX = circleX + 1;
		// pWidth = pWidth + 1;
		// pHeight = pHeight + 1;
	
}


