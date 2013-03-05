import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class chapter_7_3 extends PApplet {

// declare all global variables (stays the same)
int x = 0;
int speed = 1;
int w = 32;
int y;

public void setup(){
	size(200, 200);
	y = height/2;
	smooth();
}

public void draw(){
	background(255);
	move(mouseX/10);
	bounce();
	display();	
}

// Function to move the ball
public void move(int speedFactor) {
	// change the x loc by speed
	x = x + speed*speedFactor;
}

public void bounce() {
	// if we've reached the edge, revese the polarity
	if ((x > width - w) || (x < 0)) {
		speed = speed * -1;
	}
}


public void display() {
	background(255);
	// rectMode(CENTER);
	noFill();
	stroke(0);
	rect(x, y, w, w);
	fill(255);
	rect(x+10,y+6,4,4);
	rect(x+20,y+6,4,4);
	line(x + 10, y+20, x + 25, y + 20);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_7_3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
