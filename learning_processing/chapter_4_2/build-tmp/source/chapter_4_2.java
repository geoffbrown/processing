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

public class chapter_4_2 extends PApplet {

float circleX = 0;
float circleY = 0;
float circleW = 50;
float circleH = 100;
float circleStroke = 255;
float circleFill = 0;
float backgroundColor = 255;
float change = .5f;

// basic setup

public void setup(){
	size(200, 200);
	smooth();
}

public void draw(){
	// draw the background and the ellipse
	background(backgroundColor);
	stroke(circleStroke);
	fill(circleFill);
	ellipse(circleX, circleY, circleW, circleH);

	// change the values of all variables

	circleX = circleX + change;
	circleY = circleY + change;
	circleW = circleW + change;
	circleH = circleH - change;
	circleStroke = circleStroke - change;
	circleFill = circleFill + change;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
