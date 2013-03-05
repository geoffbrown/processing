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

public class chapter_13_6 extends PApplet {

float theta = 0.0f;

public void setup(){
	size(200, 200);
	smooth();
}

public void draw(){
	background(255);

	//get the result of the sine function
	// scale so that values oscillate between 0 and width

	float x = (sin(theta) + 1) * width/2;

	// with each cycle, increment theta
	theta += 0.05f;

	// draw the ellipse at the value produced by sine

	fill(0);
	stroke(0);
	line(width/2, 0, x, height/2);
	ellipse(x, height/2, 16, 16);	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_13_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
