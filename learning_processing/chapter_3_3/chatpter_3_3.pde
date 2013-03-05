void setup(){
  //set the size of the window
  size(200,200);
}

void draw(){
  //draw a white background
  background(255);


//Set CENTER mode
ellipseMode(CENTER);
rectMode(CENTER);

//Draw Zoog's body
stroke(0);
fill(150);
rect(mouseX,mouseY,20,100, 4);

// Draw Zoog's head
stroke(0);
fill(255);
ellipse(mouseX,mouseY-30,60,60);

// Draw Zoog's eyes
fill(0);
ellipse(mouseX-19, mouseY-30, 16, 32);
ellipse(mouseX+19, mouseY-30, 16, 32);

//Draw Zoog's legs
stroke(0);
line(mouseX-10, mouseY+50, mouseX-20, mouseY+70);
line(mouseX+10, mouseY+50, mouseX+20, mouseY+70);

}
