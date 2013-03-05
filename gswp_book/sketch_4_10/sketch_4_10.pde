void setup(){
	size(480, 220);
	background(0);
	smooth();
	noStroke();

	for (int y = 0; y<=height; y+=40){
		for (int x = 0; x<=width; x+=40){
			fill(255,140);
			ellipse(x,y,40,40);
		}
	}
}

void draw(){
		
}