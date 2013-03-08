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

public class sketch_5_9 extends PApplet {

float x;
float y;

float px;
float py;

float easing = 0.1f;

public void setup(){
	size(480,120);
	smooth();
	stroke(0,102);
}

public void draw(){
	float targetX = mouseX;
	x += (targetX - x)*easing;

	float targetY = mouseY;
	y += (targetY - y)*easing;

	float weight = dist(x, y, px, py);
	line(x,y,px,py);
	strokeWeight(weight);
	py = y;
	px = x;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_5_9" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
