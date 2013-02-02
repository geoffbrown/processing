float zoogX;
float zoogY;

float eyeR;
float eyeG;
float eyeB;

void setup(){
	size(200, 200);
	zoogX = width/2;
	zoogY = height + 100;
	smooth();
}

void draw(){
	background(255);

	// set ellipse and rec to CENTER mode
	ellipseMode(CENTER);
	rectMode(CENTER);

	// draw zoog's body

	stroke(0);
	fill(150);
	rect(zoogX, zoogY, 20, 100);

	stroke(0);
	fill(255);
	ellipse(zoogX, zoogY-30, 60, 60);

	// Zoog's eyes
	eyeR = random(255);
	eyeG = random(255);
	eyeB = random(255);
	fill(eyeR, eyeG, eyeB);

	ellipse(zoogX-19, zoogY-30, 16, 32);
	ellipse(zoogX+19, zoogY-30, 16, 32);

	// Zoog's legs

	stroke(150);
	line(zoogX-10, zoogY+50, zoogX-10, height);
	line(zoogX+10, zoogY+50, zoogX+10, height);

	// make zoog fly upwards
	zoogY = zoogY - 1;

	// make zoog shake a bit when launching
	zoogX = random(zoogX-1, zoogX+1);
}	
