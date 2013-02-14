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

public class chapter_9_6 extends PApplet {

// x and y positions

int arrayLength = 45;

int[] xpos = new int[arrayLength];
int[] ypos = new int[arrayLength];

public void setup(){

	size(200, 200);
	smooth();

	// initialize
	for (int i = 0; i<xpos.length; i++){
		xpos[i] = 0;
		ypos[i] = 0;
	}
}

public void draw(){
	background(255);
	//shift all elements down one spot
	// xpos[0] = xpos[1] and so on
	// stop at the second to last element, hence the -1
	for (int i = 0; i<xpos.length-1; i++){
		xpos[i] = xpos[i+1];
		ypos[i] = ypos[i+1];
		println("i: "+i);
	}

	// set new locations
	xpos[xpos.length-1] = mouseX;
	ypos[ypos.length-1] = mouseY;

	// draw everything
	for (int i = 0; i<xpos.length; i++){
		noStroke();
		fill(255-i*5);
		ellipse(xpos[i], ypos[i],i,i);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_9_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
