float x = 0;
float easing = .1;

void setup(){
	size(220,120);
	smooth();
}

void draw(){
	float targetX = mouseX;
	// x += (targetX - x)*easing;
	x = x + (targetX - x)*easing;

	/*
	
	0 +(100 - 0)*.1 = 10

	*/

	ellipse(x,40,12,12);
	println(targetX + ": " + x);	
}