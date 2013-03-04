// starting angle
float theta = 0.0;
float velocity = .09;
float pHeight = 4;

void setup(){
	size(200,200);
	smooth();
}

void draw(){
	background(255);
	pHeight = 4;

	//increment theta
	theta += velocity;
	noStroke();
	fill(0);

	float x = theta;
	// a simple way to draw the wave with an ellipse at each location
	for (int i = 0; i<=360; i++){
		// calculate y value based off of sine function
		float y = sin(x)*height/pHeight;
		// draw an ellipse
		ellipse(i-40, y+height/2, 16,16);
		// move along the x-axis
		x += velocity;
	}
}

