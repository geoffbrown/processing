// example 5-9 page 78-79
// for reference, if needed: http://www.openprocessing.org/sketch/47766

float x = 100; // x location of square
float y = 0; // y loc of square

float speed = 0; // speed of square
float gravity = .75; // gravity effect
float decay = -.65; // set decay

int h = 10; // height
int w = 10; // width

void setup(){
	size(200, 200);
}

void draw(){
	background(255);
	// display the square
	fill(0);
	noStroke();
	rect(x, y, w, h);
	/* 
	speed = speed + gravity
	speed now looks like this:
	speed = .1
	speed = .2
	speed = .3, etc
	*/
	speed = speed + gravity;

	// location = location + speed
	y = y + speed;

	// if the square reaches the bottom, reverse the speed

	if (y > height - h){
		// set the position to be on the floor
		y = height - h;
		speed = speed * decay;
	}
}

