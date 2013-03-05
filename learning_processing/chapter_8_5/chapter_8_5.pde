Ball ball1;
Ball ball2;

float gravity = 0.1;

void setup(){
	size(200, 200);
	smooth();

	// create new ball objs
	ball1 = new Ball(50,0,16);
	ball2 = new Ball(100,50,32);
}

void draw(){

	background(255);

	ball1.display();
	ball2.display();

	ball1.update();
	ball2.update();
		
}