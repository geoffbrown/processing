// create an array of stripes
Stripe[] stripes = new Stripe[10];

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

void setup(){
	size(200, 200);
	//initialize all 'stripes'
	for (int i = 0; i<stripes.length; i++){
		stripes[i] = new Stripe();
	}
}

void draw(){
	background(100);

	// move and display all stripes
	for (int i = 0; i<stripes.length; i++){
		stripes[i].display();
		stripes[i].move();
		stripes[i].rollover(mouseX, mouseY);
	}

}