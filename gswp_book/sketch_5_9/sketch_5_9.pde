float x;
float y;

float px;
float py;

float easing = 0.1;

void setup(){
	size(480,120);
	smooth();
	stroke(0,102);
}

void draw(){
	float targetX = mouseX;
	x += (targetX - x)*easing;

	float targetY = mouseY;
	y += (targetY - y)*easing;

	float weight = dist(x, y, px, py);
	line(x,y,px,py);
	strokeWeight(weight);
	py = y;
	px = x;
}