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

public class chapter_9_10 extends PApplet {

// create an array of stripes
Stripe[] stripes = new Stripe[10];

/*

reference:

declaring a single array -->

int[] xpos = new int[50]
this says create a new array called xpos of type int, then
create a new array, and give it a length of 50 int types

for an object array:

Stripe[] stripes = new Stripe[10];
this creates a new array called stripes of type Stripe, then
create a new array, and give it a length of 10 Stripe types


*/

public void setup(){
	size(200, 200);
	//initialize all 'stripes'
	for (int i = 0; i<stripes.length; i++){
		stripes[i] = new Stripe();
	}
}

public void draw(){
	background(100);

	// move and display all stripes
	for (int i = 0; i<stripes.length; i++){
		stripes[i].display();
		stripes[i].move();
		stripes[i].rollover(mouseX, mouseY);
	}

}
class Stripe
{

	float x;		// horizontal location of stripe
	float speed;	// speed of stripe
	float w;		// width of stripe
	boolean mouse; 	// state of stripe (mouse over or not?)
	
	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Stripe() {
		x = 0;					// all stripes start at 0
		speed = random(1);		// all stripes have a random positive speed
		w = random(10,30);		// wide gets random num between 10-30
		mouse = false;			// mouse bool starts off false
	}
	

	// Draw stripe

	public void display() {
		// what to display
		if (mouse){
			fill(255);
		}else {
			fill(255,100);
		}
		noStroke();
		rect(x, 0, w, height);
	}

	public void move() {
		// what to move
		x += speed;
		if (x>width+20) x = -20;

	}

	public void rollover(int mx, int my) {
		// left edge is x, right edge is x+w
		if (mx > x && mx < x + w){
			mouse = true;
		} else {
			mouse = false;
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_9_10" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
