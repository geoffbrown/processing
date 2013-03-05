float time = 0.0;
float increment = 0.01;

void setup(){
	size(200, 200);
	smooth();
}

void draw(){
	background(255);

	float n = noise(time) * width;

	// width each cycle increment time

	time += increment;

	// draw the ellipse with the size determined by perlin noise

	fill(0);
	ellipse(width/2, height/2, n, n);	
}