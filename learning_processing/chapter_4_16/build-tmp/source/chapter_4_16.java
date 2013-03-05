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

public class chapter_4_16 extends PApplet {

// example 5-10 page 79-80

float x = 100;
float y = 100;
float w = 120;
float h = 60;
float eyeSize = 16;

float xspeed = 3;
float yspeed = 1;

public void setup(){
	size(200, 200);
	smooth();
}

public void draw(){
	// chage the location of Zoog by speed
	x = x + xspeed;
	y = y + yspeed;

	if ((x > width) || (x < 0)){
		xspeed = xspeed * -1;
	}

	if ((y > height) || (y < 0)){
		yspeed = yspeed * -1; 
	}

	background(255);
	ellipseMode(CENTER);
	rectMode(CENTER);


	// drawing zoog's body

	stroke(0);
	fill(150);
	rect(x, y, w/6, h*2);

	// the head

	fill(255);
	ellipse(x, y-h/2, w, h);

	// eyes

	fill(0);
	ellipse(x-w/3+2, y-h/2, eyeSize, eyeSize*2);
	ellipse(x+w/3-2, y-h/2, eyeSize, eyeSize*2);

	// legs

	stroke(0);
	line(x-w/12, y+h, x-w/4, y+h+10);
	line(x+w/12, y+h, x+w/4, y+h+10);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_16" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
