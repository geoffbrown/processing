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

public class chapter_4_4 extends PApplet {

float r = 100;
float g = 150;
float b = 200;
float a = 200;

float diam = 50;
float x = 100;
float y = 100;

public void setup(){
	size(200, 200);
	background(255);
	smooth();
}

public void draw(){
	// use variables to draw an ellipse
	noStroke();
	fill(r, g, b, a);
	ellipse(x, y, diam, diam);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
