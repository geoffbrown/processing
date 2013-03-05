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

public class chapter_6_9 extends PApplet {

int w = 25;

int x = 0;
int y = 0;

float r = 0;
float g = 0;
float b = 0;


public void setup(){
	size(300, 300);
	background(255);
	noStroke();
	frameRate(100);
}

public void draw(){
		fill(r, g, b);
		rect(x, y, w, w);

		r = random(0,255);
		g = random(0,255);
		b = random(0,255);

		x+=w;

		if (x >= width){
			x = 0;
			y += w;
		} else if (y>= height) {
			y = y;
			x = x;
			println("done.");
		}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_6_9" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
