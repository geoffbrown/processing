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

public class chapter_10_8 extends PApplet {

Catcher catcher;				// one catcher object
Timer timer;					// one timer object
Drop[] drops;					// an array of drop objects

int totalDrops = 0;				// totalDrops


public void setup(){
	size(400, 400);
	noStroke();
	catcher = new Catcher(32);	// create catcher w/ radius of 32
	drops = new Drop[1000];		// create 1k spots in the array
	timer = new Timer(300);	// create a 2 sec timer

	timer.start();				// starts the timer

}

public void draw(){
	background(255);

	catcher.setLocation(mouseX, mouseY);	// set catcher loc
	catcher.display();						// display catcher

	// check the timer
	if(timer.isFinished()) {

		// deal with raindrops
		// initialize one drop
		drops[totalDrops] = new Drop();

		// increment totalDrops
		totalDrops++;

		//if we hit the end of the array
		if (totalDrops >= drops.length){
			totalDrops = 0; // start over
		}

		timer.start();
	}


	// boolean intersecting = ball1.intersect(ball2);
	// if(intersecting) {
	// 	println('circles. intersecting. crazy.')
	// }

	

	for (int i = 0; i<totalDrops; i++){
		drops[i].display();
		drops[i].move();
		if (catcher.intersect(drops[i])){
			drops[i].caught();
		}
	}

}
class Catcher
{
	float r;		// radius
	float x,y;		// location

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Catcher (float r_) {
		r = r_;
		x = 0;
		y = 0;
	}

	public void setLocation(float x_, float y_){
		x = x_;
		y = y_;
	}

	public void display(){
		fill(175);
		ellipse(x, y, r*2, r*2);
	}

	public boolean intersect(Drop d){
		// calculate the distance
		float distance = dist(x, y, d.x, d.y);
		// compare the distance to the sum of radii
		if (distance < r + d.r){
			return true;
		} else {
			return false;
		}
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
	
		// ellipse(x, y, r, r);

		for (int i = 2; i<8; i++){
			fill(c);
			noStroke();
			ellipse(x, y+i*4, i*2, i*2);
		}
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

	public void caught() {
		speed = 0;
		y = -1000;
		println("got that fukr");
	}
}
class Timer {
	int savedTime;			// when Timer started
	int totalTime;			// How long the timer should last

	Timer(int totalTime_) {
		totalTime = totalTime_;
	}

	public void start() {
		savedTime = millis();
	}

	public boolean isFinished() {
		int passedTime = millis() - savedTime;
		if (passedTime > totalTime){
			return true;
		} else {
			return false;
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_10_8" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
