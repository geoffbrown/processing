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

	for (x = 0; x<width; x+=w){
		for (y = 0; y<height; y+=w){
			r = random(0,255);
			g = random(0,255);
			b = random(0,255);
			fill(r,g,b);
			rect(x, y, w, w);
		}
	}


	

}

void draw(){
	
}