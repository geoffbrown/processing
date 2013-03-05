int ballCount = 0;

Ball[] ballArray = new Ball[100];

void setup(){
	size(400, 400);
	smooth();
	noStroke();

	// initialize balls
	for (int i = 0; i<ballArray.length; i++){
		ballArray[i] = new Ball(255,30,3,.4);
	}

}

void draw(){
	background(0);
	//display a ball
	//update a ball
	ballArray[ballCount].display();
	println("ballCount: "+ballCount);
		
}

void mousePressed(){

	ballCount++;
	ballArray[ballCount].setPosition(mouseX, mouseY);

	// increment ballCount
	// make a new ball



}