int savedTime;
int totalTime = 5000;		// 5 seconds

void setup(){
	size(200,200);
	background(0);
	savedTime = millis();
}

void draw(){
	// calculate how much time has passed
	int passedTime = millis() - savedTime;

	// has 5 seconds pased?
	if (passedTime > totalTime){
		println("5 seconds have passed!");
		background(random(255));
		savedTime = millis();
	}
}