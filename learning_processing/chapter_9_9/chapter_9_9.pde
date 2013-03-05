Car[] cars = new Car[2]; // 100 car objects


void setup(){
	size(200, 200);
	smooth();

	for (int i = 0; i<cars.length; i++){
		cars[i] = new Car(color(i*2), 0, i*2, i/20.0);
		// initialize each car using a for loop
	}
}

void draw(){
		background(255);
		for (int i = 0; i<cars.length; i++){
			cars[i].move();
			cars[i].display();
		}
}