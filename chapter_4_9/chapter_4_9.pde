float bright0 = 0;
float bright1 = 0;
float bright2 = 0;
float bright3 = 0;

void setup(){
	size(200, 200);
}

void draw(){
		background(255);
		stroke(0);
		line(width/2, 0, width/2, height);
		line(0, height/2, width, height/2);

		/* 
		concept, in order:
		draw 4 quads, set their brightness to it's own variable.
		always make the variables decay
		if the mouse is in that quad, turn the brightness all the way up
		*/

		// if the mouse is in the quad, set the quad's brightness to full
		if (mouseX < width/2 && mouseY < height/2) {
			bright0 = 255;
		} else if (mouseX > width/2 && mouseY < height/2){
			bright1 = 255;
		} else if (mouseX < width/2 && mouseY > height/2){
			bright2 = 255;
		} else if (mouseX > width/2 && mouseY > height/2){
			bright3 = 255;
		}

		// always make the variable decay
		bright0 = bright0-10;
		bright1 = bright1-10;
		bright2 = bright2-10;
		bright3 = bright3-10;

		// draw the quads and fill them with the current brightness
		noStroke();
		fill(bright0);
		rect(0, 0, width/2, height/2);
		fill(bright1);
		rect(width/2, 0, width/2, height/2);
		fill(bright2);
		rect(0, height/2, width, height);
		fill(bright3);
		rect(width/2, height/2, width/2, height/2);

		// constrain variables 
		bright0 = constrain(bright0, 0, 255);
		bright1 = constrain(bright1, 0, 255);
		bright2 = constrain(bright2, 0, 255);
		bright3 = constrain(bright3, 0, 255);
}
