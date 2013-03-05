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

public class chapter_13_4 extends PApplet {

float time = 0.0f;
float increment = 0.01f;

public void setup(){
	size(200, 200);
	smooth();
}

public void draw(){
	background(255);

	float n = noise(time) * width;

	// width each cycle increment time

	time += increment;

	// draw the ellipse with the size determined by perlin noise

	fill(0);
	ellipse(width/2, height/2, n, n);	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_13_4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
