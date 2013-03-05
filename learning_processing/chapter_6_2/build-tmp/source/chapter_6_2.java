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

public class chapter_6_2 extends PApplet {

// fig 6.5 page 84


int h = 5; // hight of rectangle
int space = h + 2; // set the recs 10 px apart each

int x = 10; // place to start all recs on the x axis
int y = 0; // place to begin the y for looping
int w; // initialie w variable for setup call



public void setup(){
	size(150, 400);
	background(255);
	w = width - x*2; // width of rect
}

public void draw(){
	
	while (y < height){
		rect(x, y, w, h);
		y = y + space;
	}

	y = y + 1;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_6_2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
