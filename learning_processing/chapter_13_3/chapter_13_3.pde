void setup(){
	size(200, 200);
	background(255);
	smooth();
	noStroke();
}

void draw(){
	// probabilities for 3 different cases
	// these need to add up to 100%
	float red_prob = 0.60;		// 60% chance of red color
	float green_prob = 0.10; 	// 10% chance of green
	float blue_prob = 0.30;		// 30% chance of blue

	float num = random(1);		// pick a random num between 0-1

	// if random number is less than .6
	if (num < red_prob){
			fill(255, 53, 2, 150);
		} else if (num < green_prob + red_prob){
			fill(156, 255, 28, 150);
		} else {
			fill(10,52,178,150);
		}

		ellipse(random(width), random(height), 64, 64);
}