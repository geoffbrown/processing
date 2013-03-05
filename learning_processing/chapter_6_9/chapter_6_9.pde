int w = 25;

int x = 0;
int y = 0;

float r = 0;
float g = 0;
float b = 0;


void setup(){
	size(300, 300);
	background(255);
	noStroke();
	frameRate(100);
}

void draw(){
		fill(r, g, b);
		rect(x, y, w, w);

		r = random(0,255);
		g = random(0,255);
		b = random(0,255);

		x+=w;

		if (x >= width){
			x = 0;
			y += w;
		} else if (y>= height) {
			y = y;
			x = x;
			println("done.");
		}
}