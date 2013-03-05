// example 5-8 page 77-78

int x = 0; // x location of square
int y = 0; // y location of square

int speed = 5; // speed of square

int state = 0; // initialize state of square as 0, variable that keeps tract of square moving left/right/up/down

void setup(){
	size(200, 200);
}

void draw(){
	background(100);

	// display the square
	noStroke();
	fill(255);
	rect(x, y, 10, 10);

	//conditional to determine which state of the square we're in

	// if the state is 0, then
	if (state == 0){
			// x loc of square increments by speed
			x = x + speed;
			// if the x loc is greater than the width of the screen minus 
			// the squares own width, stop motion and change state to 1
			// state one means the y loc will now need to increase
			if (x > width-10){
				x = width-10;
				state = 1;
			}
			// if we're in state 1...
		} else if (state == 1) {
			// move the y loc of the square by the speed
			y = y + speed;
			// if the y loc is greater than the height of the screen minus
			// the squares own height, stop motion and change to state 2
			// state 2 means the x loc will be decremented
			if (y > height - 10){
				y = height - 10;
				state = 2;
			}
			// if we're in state 2, then...
		}else if (state == 2) {
			// subtract the speed from the x location
			x = x - speed;
			// if the x loc of the square is less than zero, stop motion
			// change the state to 3
			// state 3 means decrement the y location by speed
			if (x < 0){
				x = 0;
				state = 3;
			}
			// if we're in state 3, the last state, then...
		}else if (state == 3) {
			// the y loc is decremented by speed until its less than zero
			y = y - speed;
			// when it's less than zero, stop decrementing by speed and stop motion
			// change the state back to state 0, in order to increment x by speed
			if (y < 0){
				y = 0;
				state = 0;
			}
		}
}
