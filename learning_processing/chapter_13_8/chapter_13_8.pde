float time = 0.0;
float increment = 0.01;

void setup(){
	size(200,200);
	smooth();
}

void draw(){
	background(255);
	stroke(0);
	noFill();

	float n = noise(time) * width*1.25;
	time += increment;

	drawCircle(width/2, height/2, n);
}

void drawCircle(float x, float y, float radius) {
	// float x = random(_x);
	// float y = random(_y);
	// float radius = random(_radius);
	ellipse(x, y, radius, radius);
	if(radius>8){
		drawCircle(x+radius/2, y, radius/2);
		drawCircle(x-radius/2, y, radius/2);

		drawCircle(x, y+radius/2, radius/2);
		drawCircle(x, y-radius/2, radius/2);
	}
}