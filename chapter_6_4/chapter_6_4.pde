int x;
int y;

int xy = 20; // width and height
int increase = 30;
int totalCircles = 10;
int pAlpha = 255;

int amountToDecrease = pAlpha/totalCircles;

void setup(){
	size(300, 300);
	noStroke();
	// stroke(0);
	background(255);
	x = width/2;
	y = width/2;

	for (int i = 0; i < totalCircles; i ++) {
		// println(pAlpha);
		fill(0,0,0,pAlpha);
  		ellipse(x, y, xy, xy);
  		xy = xy + increase;
  		pAlpha = pAlpha - amountToDecrease;
	}
}

void draw(){
	//
}
