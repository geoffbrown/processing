// A polar coordinate

float r = 0.77;
float theta = 0;

void setup(){
	size(200,200);
	background(255);
	smooth();
}

void draw(){
	// polar to cartesian conversion
	float x = r * cos(theta);
	float y = r * sin(theta);

	// draw an ellipse at x, y

	noStroke();
	fill(0);
	//ellipse(x+width/2, y + height/2, 16, 16); // adjust for height of window
	ellipse(x + width/2, y + height/2, 16, 16); // adjust for height of window

	// increment angle
	theta += 0.07;
	r +=.4;
}