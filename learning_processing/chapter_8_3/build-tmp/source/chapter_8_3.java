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

public class chapter_8_3 extends PApplet {

Zoog zoog;
Zoog zoog2;

public void setup(){
	size(200, 200);
	smooth();
	zoog = new Zoog(100,125,60,60,16);
	zoog2 = new Zoog(100,125,60,60,16);
}

public void draw(){
		background(255);
		//mouseX position determines speed factor
		float factor = constrain(mouseX/10, 0, 5);
		zoog.jiggle(factor);
		zoog.display();

		zoog2.jiggle(factor);
		zoog2.display();
}
class Zoog {
	// Zoog's variables
	float x,y,w,h,eyesize;

	//Zoog's constructor
	Zoog(float tempX, float tempY, float tempW, float tempH, float tempEyeSize) {
		x = tempX;
		y = tempY;
		w = tempW;
		h = tempH;
		eyesize = tempEyeSize;
	}

	public void jiggle(float speed){
		// change zoogs location randomly
		x = x + random(-1,1)*speed;
		y = y + random(-1,1)*speed;

		// constrain zoog to window
		x = constrain(x, 0, width);
		y = constrain(y, 0, width);
	}

	public void display(){
		ellipseMode(CENTER);
		rectMode(CENTER);

		// draw zoog's arms with a for loop

		for (float i = y - h/3; i<y+h/2; i+=10){
			stroke(0);
			line(x-w/4, i, x+w/4, i);
		}

		// draw zoogs body
		stroke(0);
		fill(175);
		rect(x,y,w/6,h);

		//draw zoog's head
		stroke(0);
		fill(255);
		ellipse(x,y-h, w, h);

		// zoog's eyes
		fill(0);
		ellipse(x-w/3, y-h,eyesize,eyesize*2);
		ellipse(x+w/3, y-h,eyesize,eyesize*2);

		// zoog's legs
		stroke(0);
		line(x-w/12,y+h/2,x-w/4,y+h/2+10);
		line(x+w/12,y+h/2,x+w/4,y+h/2+10);

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_8_3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
