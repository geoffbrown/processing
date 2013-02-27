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

public class chapter_13_5 extends PApplet {

// A polar coordinate

float r = 0.7f;
float theta = 0;

public void setup(){
	size(200,200);
	background(255);
	smooth();
}

public void draw(){
	// polar to cartesian conversion
	float x = r * cos(theta);
	float y = r * sin(theta);

	// draw an ellipse at x, y

	noStroke();
	fill(0);
	//ellipse(x+width/2, y + height/2, 16, 16); // adjust for height of window
	ellipse(x + width/2, y + height/2, 16, 16); // adjust for height of window

	// increment angle
	theta += 0.07f;
	r +=.4f;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_13_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
