void setup(){
	size(200, 200);
	background(255);
}

void draw(){
		
}

void mousePressed(){
	//when the mouse is pressed...
	stroke(0); // set stroke to black
	fill(175); // set fill to gray
	rectMode(CENTER); // change the rectMode to CENTER
	rect(mouseX, mouseY, 16, 16); // draw a 16x16px square at the mouse loc
}


void keyPressed(){
	// if any key is pressed...
	background(255); // make the entire stage white
}