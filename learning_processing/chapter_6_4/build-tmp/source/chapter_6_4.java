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

public class chapter_6_4 extends PApplet {

int x;
int y;

int xy = 20; // width and height
int increase = 30;
int totalCircles = 10;
int pAlpha = 255;

int amountToDecrease = pAlpha/totalCircles;

public void setup(){
	size(300, 300);
	noStroke();
	// stroke(0);
	background(255);
	x = width/2;
	y = width/2;

	for (int i = 0; i < totalCircles; i ++) {
		// println(pAlpha);
		fill(0,0,0,pAlpha);
  		ellipse(x, y, xy, xy);
  		xy = xy + increase;
  		pAlpha = pAlpha - amountToDecrease;
	}
}

public void draw(){
	//
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_6_4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
