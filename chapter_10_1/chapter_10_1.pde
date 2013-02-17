Catcher catcher;
Ball ball1;
Ball ball2;

void setup(){
	size(400, 400);
	smooth();
	catcher = new Catcher(32);
	ball1 = new Ball(10, 2);
	ball2 = new Ball(random(20,30), 2);

}

void draw(){
	background(255);
	catcher.setLocation(mouseX, mouseY);
	catcher.display();

	ball1.move();
	ball1.display();

	ball2.move();
	ball2.display();
}