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

// Catcher catcher;
Ball ball1;
Ball ball2;

public void setup(){
	size(400, 400);
	smooth();
	//catcher = new Catcher(32);
	ball1 = new Ball(64);
	ball2 = new Ball(32);

}

public void draw(){
	background(255);
	// catcher.setLocation(mouseX, mouseY);
	// catcher.display();

	ball1.move();
	ball2.move();

	if (ball1.intersect(ball2)){
		ball1.highlight();
		ball2.highlight();
	}

	ball1.display();
	ball2.display();


}

class Ball
{
	
	float r;					// radius of the ball
	float x,y;					// location
	float xspeed, yspeed; 		// speed
	int c = color(100,50);	// color
	int cLock = color(100,50);

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Ball (float r_) {
		// expression
		r = r_;
		x = random(0, width);
		y = random(0, height);
		xspeed = random(-5,5);
		yspeed = random(-5,5);
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

	public void highlight() {
		c = color(0,150);
	}

	public void display(){
		noStroke();
		fill(c);
		ellipse(x, y, r*2, r*2);
		c = cLock;
	}

	public boolean intersect(Ball b) {
		float distance = dist(x, y, b.x, b.y);
		if (distance < r + b.r){
			return true;
		} else {
			return false;
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
