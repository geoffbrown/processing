void setup(){
	size(480,120);

	smooth();

	fill(255);
	stroke(102);


}

void draw(){
	background(0);
	for (int y = 20; y<=height-20; y+=10){
		for (int x = 20; x<=width-20; x+=10){
			ellipse(x-width/2+mouseX,y-height/2+(mouseY),4,4);
			line(x-width/2+mouseX,y-height/2+(mouseY),width/2,height/2);
		}
	}
}