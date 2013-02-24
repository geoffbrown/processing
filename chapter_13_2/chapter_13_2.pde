// array to keep track of how often random numbers are picked

float[] randomCounts;

void setup(){
	size(200, 200);
	randomCounts = new float[20];
}

void draw(){
	background(0);
	//pick a random number and increase the count
	int index = int(random(randomCounts.length));
	randomCounts[index]++;
	println("randomCounts[index]: "+randomCounts[index]);
	// draw a rectangle to graph the results
	stroke(0);
	fill(255);
	for (int i = 0; i<randomCounts.length; i++){
		rect(i*10, 0, 9, randomCounts[i]);
		//println("i: "+i);
	}
}

