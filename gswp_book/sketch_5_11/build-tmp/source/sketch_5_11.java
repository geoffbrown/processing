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

public class sketch_5_11 extends PApplet {

public void setup(){
	size(240, 120);
	strokeWeight(12);
	smooth();
}

public void draw(){
	background(204);
	stroke(255);
	line(120,60, mouseX, mouseY);		// white line
	stroke(0);
	// float mx = map(value, low1, high1, low2, high2);
	float mx = map(mouseX, 0, width, 60, 180);
	line(120,60,mx, mouseY);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_5_11" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
