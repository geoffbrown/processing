boolean button = false;

int x = 50;
int y = 50;
int w = 100;
int h = 75;

void setup(){
	size(200, 200);
}

void draw(){
	// keep continuously checking...
	if (button){
			// if the value of button is true, change the background to white
			background(255);
			stroke(0);
		} else {
			// if the value of button is false, change the background to black
			background(0);
			stroke(255);
		}
	fill(175);
	rect(x, y, w, h);
}

void mousePressed(){
	if (mouseX > x && mouseX < x+w && mouseY>y && mouseY<y+h){ // check to see if i'm inside button space
		button = !button; // make the value of the boolean opposite what it is right now
	}
}
