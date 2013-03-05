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

public class chapter_3_8 extends PApplet {

public void setup(){
	// set the size of the window
	size(200, 200);
	smooth();
	frameRate(30);
}

public void draw(){
	// draw white bg
	background(255);
	// set ellipse and recs to CENTER mode
	ellipseMode(CENTER);
	rectMode(CENTER);

	// draw Zoog's body
	stroke(0);
	fill(175);
	rect(mouseX, mouseY, 20, 100);

	// draw Zoog's head
	stroke(0);
	fill(255);
	ellipse(mouseX, mouseY-30, 60, 60); // draws the head, the -30 adjusts for moving the head up

	// draw Zoog's eyes
	fill(mouseX,0,mouseY); // eye color is determined by mouse location
	ellipse(mouseX-19, mouseY-30, 16, 32);
	ellipse(mouseX+19, mouseY-30, 16, 32);

	// draw Zoog's legs
	stroke(0);
	line(mouseX-10,mouseY+50, pmouseX-10, pmouseY+60);
	line(mouseX+10, mouseY+50, pmouseX+10, pmouseY+60);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_3_8" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
