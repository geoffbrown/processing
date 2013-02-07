//on page 109

int x = 100;
int y = 100;
// int thesize = 64;
// int offset = thesize/4;

void setup(){
	size(200, 200);
	background(255);
}

void draw(){
	drawCar(100,100,64,color(200,200,0));
	drawCar(50,75,32,color(0,200,100));
	drawCar(80,175,40,color(200,0,0));
}

void drawCar(int x, int y, int thesize, color c) {
	// using a local variable 'offset'
	int offset = thesize/4;
	// draw main car body
	rectMode(CENTER);
	stroke(0);
	fill(c);
	rect(x,y,thesize,thesize/2);
	// draw four wheels, relative to the center
	fill(0);
	rect(x-offset, y-offset, offset, offset/2);
	rect(x+offset, y-offset, offset, offset/2);
	rect(x-offset, y+offset, offset, offset/2);
	rect(x+offset, y+offset, offset, offset/2);

}