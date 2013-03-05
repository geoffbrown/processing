Ball myBall1;

void setup(){
	size(400, 400);
	background(0);
	myBall1 = new Ball(255,50,50,2,.4);

	myBall1.setPos(width/2, -100); // initial ball drop
}

void draw(){
	background(0);
	myBall1.resetBall(mouseX, mouseY); // reset ball to mouseX and Y
	myBall1.display(); // display the ball
	myBall1.update(); // animate it
}

void mousePressed(){
	myBall1.setPos(mouseX, mouseY); // set the position of the ball

}
