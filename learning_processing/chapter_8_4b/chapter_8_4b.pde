//Ball myBall1;

/*

reference:

declaring a single array -->

int[] xpos = new int[50]
this says create a new array called xpos of type int, then
create a new array, and give it a length of 50 int types

for an object array:

Stripe[] stripes = new Stripe[10];
this creates a new array called stripes of type Stripe, then
create a new array, and give it a length of 10 Stripe types


*/

int ballCount = 0;

int totalBalls = 10;
Ball[] ballArray = new Ball[totalBalls];

void setup(){
	size(400, 400);
	background(0);
	ballCount++;
	ballArray[ballCount] = new Ball(255,50,50,2,.4);
	ballArray[ballCount].setPos(mouseX, mouseY);
	// for (int i = 0; i<ballArray.length; i++){
	// 	ballArray[i] = new Ball(255,50,50,2,.4);
	// }

	//myBall1 = new Ball(255,50,50,2,.4);
	//myBall1.setPos(width/2, -100); // initial ball drop
}

void draw(){
	background(0);
	ballArray[ballCount].display();
	// ballArray[ballCount].update();
	// ballArray[ballCount].resetBall(mouseX, mouseY);

	// for (int i = 0; i<ballArray.length; i++){
	// 	ballArray[i].display();
	// 	ballArray[i].update();
	// 	ballArray[i].resetBall(mouseX, mouseY);
	// }

	//myBall1.resetBall(mouseX, mouseY); // reset ball to mouseX and Y
	//myBall1.display(); // display the ball
	//myBall1.update(); // animate it
}

void mousePressed(){


	ballCount++;
	println("ballCount: "+ballCount);
	ballArray[ballCount] = new Ball(255,50,50,2,.4);
	ballArray[ballCount].setPos(mouseX, mouseY);

	//myBall1.setPos(mouseX, mouseY); // set the position of the ball
	// for (int i = 0; i<ballArray.length; i++){
	// 	ballArray[i].setPos(random(mouseX), random(mouseY));
	// }

	//ballCount++;
	//ballArray[ballCount] = new Ball(255,50,50,2,.4);
	//ballArray[ballCount].setPos(random(mouseX), random(mouseY));

}
