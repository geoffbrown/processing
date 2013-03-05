float w = 50;
float h = 50;
float ellipseX;
float ellipseY;
float speed = 1;

void setup(){
	size(200, 200);
	noStroke();
	ellipseX = width/2;
	ellipseY = height/2;
	smooth();
}

void draw(){
	background(255);
	fill(0);
	ellipse(ellipseX, ellipseY, 50, 50);

	ellipseX = ellipseX + speed;

	if (ellipseX > width-w/2 || ellipseX < w/2){
		speed = speed * -1;
		/* 
		simply subtracting here won't work
		saying speed = speed - 1 isn't good enough
		the equation above will get instantly rewritten by line 20
		which is ellipseX = ellipseX + speed
		that means we need to reverse the polarity of speed
		by multiplying it by -1
		*/
	}

	// the above code is doing the same thing as the commented
	// out code below, only by using double pipes for OR

	// if (ellipseX > width-w/2){
	// 	speed = speed * -1;
	// }

	// if (ellipseX < w/2){
	// 	speed = speed * -1;
	// }

}
