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

public class chapter_8_1 extends PApplet {

Circle myCircle;

public void setup(){
	size(400, 400);
	background(255);
	myCircle = new Circle();
}

public void draw(){
	// smooth();
}

public void mousePressed(){
	// println("pressed!");
	myCircle.display();
}

class Circle
{
	int c;
	int xpos;
	int ypos;


	int w;
	int h;

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Circle() {
		c = color(0);
		// xpos = mouseX;
		// ypos = mouseY;
		w = 50;
		h = 50;

		
	}

	public void display() {
		xpos = mouseX;
		ypos = mouseY;
		ellipseMode(CENTER);
		// fill(c);
		fill(xpos);
		noStroke();
		//ellipse(mouseX, mouseY, w, h);
		ellipse(xpos, ypos, w, h);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_8_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
