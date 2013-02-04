int x; // beginning x pos
int y; // beginnign y pos
float w; 
float decrease = 20; // amount to decrease radius by




float xcol = 255;

void setup(){
	size(400, 400);
	background(255);
	x = width/2;
	y = height/2; 
	w = width; // width
	smooth();
}

void draw(){
	while (w > 0){
		xcol = xcol - decrease;
		print(xcol);
		noStroke();
		fill(xcol);
		ellipse(x, y, w, w);
		w = w - decrease;
	}

	
}
