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

public class chapter_4_5 extends PApplet {

float r;
float g;
float b;
float a;

float diam;
float x;
float y;

public void setup(){
	size(200, 200);
	background(0);
	smooth();
}

public void draw(){
	r = random(255);
	g = random(255);
	b = random(255);
	a = random(255);

	diam = random(20);
	x = random(width);
	y = random(height);

	noStroke();
	fill(r, g, b, a);
	ellipse(x, y, diam, diam);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
