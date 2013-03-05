float c1 = 0;
float c2 = 255;

float c1dir = 10.1;
float c2dir = -10.1;

void setup(){
	size(200, 200);
}

void draw(){
	noStroke();

	//draw rectangle on left
	fill(c1, 0, c2);
	rect(0, 0, width/2, height);

	//draw rectangle on right
	fill(c2, 0, c1);
	rect(width/2, 0, width/2, height);

	//adjust color values
	c1 = c1 + c1dir;
	c2 = c2 + c2dir;

	if (c1 < 0 || c1 > 255){
		//reverse polarity of c1dir
		c1dir = c1dir * -1;
	}

	if (c2 < 0 || c2 > 255){
		//reverse polarity of c2dir
		c2dir *= -1;
	}
}
