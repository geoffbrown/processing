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

public class chapter_10_6 extends PApplet {

Drop[] drops = new Drop[50];

public void setup(){
	size(400, 400);
	smooth();
	for (int i = 0; i<drops.length; i++){
		drops[i] = new Drop();
	}
}

public void draw(){
	background(255);
	for (int i = 0; i<drops.length; i++){
		drops[i].display();
		drops[i].move();
	}

}
class Drop {
	float x,y;			// location of raindrops
	float speed;		// speed
	int c;			// color of raindrop
	float r;			// radius

	Drop() {
		r = 16;					// all raindrops are the same size
		x = random(width);		// start with a random x loc
		y = -r*4;				// begin above the window
		speed = random(1,5);	// pick rando speed between 1 and 5
		c = color(50,100,150);	// make the drop blue
	}

	public void display(){
		fill(c);
		noStroke();
		ellipse(x, y, r, r);
	}

	public void move() {
		y += speed;				// increment by speed!
	}

	public boolean reachedBottom(){
		if (y>height + r*4){
			return true;
		} else {
			return false;
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_10_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
