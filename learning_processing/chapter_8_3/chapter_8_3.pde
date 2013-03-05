Zoog zoog;
Zoog zoog2;

void setup(){
	size(200, 200);
	smooth();
	zoog = new Zoog(100,125,60,60,16);
	zoog2 = new Zoog(100,125,60,60,16);
}

void draw(){
		background(255);
		//mouseX position determines speed factor
		float factor = constrain(mouseX/10, 0, 5);
		zoog.jiggle(factor);
		zoog.display();

		zoog2.jiggle(factor);
		zoog2.display();
}