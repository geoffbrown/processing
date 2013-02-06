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

public class chapter_6_8 extends PApplet {

int x = 100;
int y = 100;
int w = 60;
int h = 60;
int eyeSize = 16;
int speed = 1;

public void setup(){
	size(200, 200);
	smooth();
}

public void draw(){
	// change the x location of zoog by speed
	x = x + speed;

	// if we've reached an edge, reverse the speed
	// ie: multiple it by -1
	// note: if speed is a + number, square moves to the right
	// - square moves to the left

	if ((x > width) || (x < 0)){
			speed = speed * -1;
		}	

	background(255);
	ellipseMode(CENTER);
	rectMode(CENTER);

	// Draw zoog's arms with a for loop

	for (int i = y+5; i<y+h; i+=10){ // account for how tall the body is
		stroke(0);
		line(x - w/3, i, x+w/3, i);
	}

	// zoogs body
	stroke(0);
	fill(175);
	rect(x,y,w/6,h*2);

	// zoogs head
	fill(255);
	ellipse(x, y-h/2, w, h);

	//zoog's eyes
	fill(0);
	ellipse(x-w/3, y-h/2, eyeSize, eyeSize*2);
	ellipse(x+w/3, y-h/2, eyeSize, eyeSize*2);

	//zoog's legs
	stroke(0);
	line(x-w/12,y+h,x-w/4,y+h+10);
	line(x+w/12,y+h,x+w/4,y+h+10);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_6_8" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
