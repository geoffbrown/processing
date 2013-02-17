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

public class chapter_10_1 extends PApplet {

Catcher catcher;
Ball ball1;
Ball ball2;

public void setup(){
	size(400, 400);
	smooth();
	catcher = new Catcher(32);
	ball1 = new Ball(10, 2);
	ball2 = new Ball(random(20,30), 2);

}

public void draw(){
	background(255);
	catcher.setLocation(mouseX, mouseY);
	catcher.display();

	ball1.move();
	ball1.display();

	ball2.move();
	ball2.display();
}
class Ball
{
	
	float r;				// radius of the ball
	float x,y;				// location
	float xspeed, yspeed; 	// speed

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Ball (float r_, float speed_) {
		// expression
		r = r_;
		x = random(0, width);
		y = random(0, height);
		xspeed = speed_;
		yspeed = speed_;
	}

	public void move(){
		x += xspeed;
		y += yspeed;

		if (x > width || x < 0){
			xspeed *= -1;
		}

		if (y > height || y < 0){
			yspeed *= -1;
		}
	}

	public void display(){
		stroke(0);
		fill(0,50);
		ellipse(x, y, r*2, r*2);
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
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_10_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
