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

public class chapter_13_7 extends PApplet {

// starting angle
float theta = 0.0f;
float velocity = .09f;
float pHeight = 4;

public void setup(){
	size(200,200);
	smooth();
}

public void draw(){
	background(255);
	pHeight = 4;

	//increment theta
	theta += velocity;
	noStroke();
	fill(0);

	float x = theta;
	// a simple way to draw the wave with an ellipse at each location
	for (int i = 0; i<=360; i++){
		// calculate y value based off of sine function
		float y = sin(x)*height/pHeight;
		// draw an ellipse
		ellipse(i-40, y+height/2, 16,16);
		// move along the x-axis
		x += velocity;
	}
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_13_7" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
