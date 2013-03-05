Zoog[] zoogies = new Zoog[200];

void setup(){
	size(400,400);
	smooth();
	for (int i = 0; i<zoogies.length; i++){
		zoogies[i] = new Zoog(random(width), random(height), 30,30,8);
	}
}

void draw(){
	background(255);
	for (int i = 0; i<zoogies.length; i++){
			zoogies[i].display();
			zoogies[i].jiggle(3);
		}	
}