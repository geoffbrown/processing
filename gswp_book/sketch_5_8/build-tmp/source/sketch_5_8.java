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

public class sketch_5_8 extends PApplet {

float x = 0;
float easing = .1f;

public void setup(){
	size(220,120);
	smooth();
}

public void draw(){
	float targetX = mouseX;
	// x += (targetX - x)*easing;
	x += (targetX - x)*easing;
	ellipse(x,40,12,12);
	println(targetX + ": " + x);	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_5_8" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
