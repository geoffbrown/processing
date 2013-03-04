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

public class chapter_13_8 extends PApplet {

float time = 0.0f;
float increment = 0.01f;

public void setup(){
	size(200,200);
	smooth();
}

public void draw(){
	background(255);
	stroke(0);
	noFill();

	float n = noise(time) * width*1.25f;
	time += increment;

	drawCircle(width/2, height/2, n);
}

public void drawCircle(float x, float y, float radius) {
	// float x = random(_x);
	// float y = random(_y);
	// float radius = random(_radius);
	ellipse(x, y, radius, radius);
	if(radius>8){
		drawCircle(x+radius/2, y, radius/2);
		drawCircle(x-radius/2, y, radius/2);

		drawCircle(x, y+radius/2, radius/2);
		drawCircle(x, y-radius/2, radius/2);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_13_8" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
