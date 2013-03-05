void setup(){
	size(512, 512);
	smooth();
	stroke(255);
	background(0);
}

void draw(){
	strokeWeight(dist(mouseX, mouseY, pmouseX, pmouseY)/4);
	line(mouseX, mouseY, pmouseX, pmouseY);	
}