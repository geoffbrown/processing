void setup(){
  size(480,320);
  smooth();

  stroke(255);
  strokeWeight(1);


}

void draw(){
	  background(0);
	  for (int i = 20; i<400; i+=20){
  	line(i,0,i+i/2 + mouseX/2,80 + mouseY);
  	// line(i + i/2, 80, i*1.2, 120);
  	line(i, height, i+i/2 + mouseX/2, 80+mouseY);
  }
}

