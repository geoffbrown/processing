// beginning of 6/Loops on page 81

int x = 50; // initial x pos for first line
int y = 80; // y pos for all lines
int spacing = 10; // space between lines
int len = 20; // length of each line

int endLegs = 150;

void setup(){
	size(200, 200);
}

void draw(){
	stroke(0);
	while (x < endLegs){
		line(x, y, x, y + len);
		x = x + spacing;
	}
}
