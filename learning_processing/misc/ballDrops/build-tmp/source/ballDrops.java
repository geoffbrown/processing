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

public class ballDrops extends PApplet {

int ballCount = 0;

Ball[] ballArray = new Ball[100];

public void setup(){
	size(400, 400);
	smooth();
	noStroke();

	// initialize balls
	for (int i = 0; i<ballArray.length; i++){
		ballArray[i] = new Ball(255,30,3,.4f);
	}

}

public void draw(){
	//background(0);
	//display a ball
	//update a ball
	ballArray[ballCount].display();
	println("ballCount: "+ballCount);
		
}

public void mousePressed(){

	ballCount++;
	ballArray[ballCount].setPosition(mouseX, mouseY);

	// increment ballCount
	// make a new ball



}
class Ball {
	int c;		// color
	float x;		// xpos
	float y;		// ypos
	float w;		// width
	float speed;	// speed
	float grav;		// gravity

	Ball(int c_, float w_, float speed_, float grav_){
		c = c_;
		w = w_;
		speed = speed_;
		grav = grav_;
	}

	public void display() {
		ellipseMode(CENTER);
		fill(c);
		ellipse(x, y, w, w);
	}

	public void setPosition(float x_, float y_) {
		x = x_;
		y = y_;

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ballDrops" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
