int subtr = 40;

void setup(){
  size(600,600);
  smooth();
}

void draw(){
  background(255); // make background white
  for (float i = width; i > 0; i -= subtr) {
  	/*
	i = width of screen
	run if i is greater than 0
	every loop width is decremented by 20
  	*/
    // stroke(0);
    // noStroke();
    stroke(250);
    fill(i);
    println(i);
    ellipse(width/2,height/2,i,i);
  }
}
