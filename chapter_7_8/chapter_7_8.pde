// zoog with functions, page 117-118

float x = 100;
float y = 100;
float w = 60;
float h = 60;
float eyeSize = 16;

void setup(){
	size(200, 200);
	smooth();
}

void draw(){
	background(255); // draw a white background

	// mouseX position determines speed factor for moveZoog funtion
	float factor = constrain(mouseX/10, 0, 5);
	jiggleZoog(factor);

	// pass in a color to drawZoog
	//function for eye's color	

	float d = dist(x,y,mouseX,mouseY);
	color c = color(d);

	drawZoog(c);

	void jiggleZoog(float,speed) {
		// Change the x and y location of Zoog randomly
		x = x + random(-1,1)*speed;
	}
}