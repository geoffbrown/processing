// declare all global variables (stays the same)
int x = 0;
int speed = 1;
int w = 32;
int y;

void setup(){
	size(200, 200);
	y = height/2;
	smooth();
}

void draw(){
	background(255);
	move(mouseX/10);
	bounce();
	display();	
}

// Function to move the ball
void move(int speedFactor) {
	// change the x loc by speed
	x = x + speed*speedFactor;
}

void bounce() {
	// if we've reached the edge, revese the polarity
	if ((x > width - w) || (x < 0)) {
		speed = speed * -1;
	}
}


void display() {
	background(255);
	// rectMode(CENTER);
	noFill();
	stroke(0);
	rect(x, y, w, w);
	fill(255);
	rect(x+10,y+6,4,4);
	rect(x+20,y+6,4,4);
	line(x + 10, y+20, x + 25, y + 20);
}