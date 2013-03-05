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

public class chapter_4_6 extends PApplet {

float zoogX;
float zoogY;

float eyeR;
float eyeG;
float eyeB;

public void setup(){
	size(200, 200);
	zoogX = width/2;
	zoogY = height + 100;
	smooth();
}

public void draw(){
	background(255);

	// set ellipse and rec to CENTER mode
	ellipseMode(CENTER);
	rectMode(CENTER);

	// draw zoog's body

	stroke(0);
	fill(150);
	rect(zoogX, zoogY, 20, 100);

	stroke(0);
	fill(255);
	ellipse(zoogX, zoogY-30, 60, 60);

	// Zoog's eyes
	eyeR = random(255);
	eyeG = random(255);
	eyeB = random(255);
	fill(eyeR, eyeG, eyeB);

	ellipse(zoogX-19, zoogY-30, 16, 32);
	ellipse(zoogX+19, zoogY-30, 16, 32);

	// Zoog's legs

	stroke(150);
	line(zoogX-10, zoogY+50, zoogX-10, height);
	line(zoogX+10, zoogY+50, zoogX+10, height);

	zoogY = zoogY - 1;
	zoogX = random(zoogX-1, zoogX+1);
}	
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
