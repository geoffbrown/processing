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

public class chapter_8_4 extends PApplet {

Ball myBall1;

public void setup(){
	size(400, 400);
	background(0);
	myBall1 = new Ball(255,50,50,2,.4f);

	myBall1.setPos(width/2, -100);
}

public void draw(){
	background(0);
	myBall1.resetBall(mouseX, mouseY); // reset ball to mouseX and Y
	myBall1.display(); // display the ball
	myBall1.update(); // animate it
}

public void mousePressed(){
	myBall1.setPos(mouseX, mouseY); // set the position of the ball

}
class Ball {
	int c; // initialize color

	float w; // initialize width
	float h; // initialize height

	float xpos; // initialize x postion
	float ypos; // initialize y position
	float speed; // initialize speed
	float grav; // initialize grav

	float setX;
	float setY;

	float initSpeed; // initialize the stored value of speed for resetting
	float initGrav; // initialize the stored value of grav for resetting

	Ball(int tempC, float tempW, float tempH, float tempSpeed, float tempGrav) {
		c = tempC;
		w = tempW;
		h = tempH;

		// store initial values as their own variable
		initSpeed = tempSpeed;
		initGrav = tempGrav;
		
		// pass in speed and grav
		speed = tempSpeed;
		grav = tempGrav;
	}

	// reset the ball location
	public void resetBall(float pSetX, float pSetY){
		setX = pSetX;
		setY = pSetY;
		ellipse(setX, setY, w, h);
	}

	// creates a display method that's run on draw();
	public void display(){
		noStroke();
		fill(c);
		rectMode(CENTER);
		ellipse(xpos, ypos, w, h); // create the dropping ball

	}

	// sets the values of the ball to drop, and resets grav + speed
	public void setPos(float tempXpos, float tempYpos) {
		// reset grav and speed
		grav = initGrav;
		speed = initSpeed;

		// set the x and ypos via the method call
		xpos = tempXpos;
		ypos = tempYpos;
	}

	// draw it out and make it bounce
	public void update() {		
		speed += grav;
		ypos += speed;
		if (ypos>height - h/2){
			ypos = height - h/2;
			speed = speed *-0.95f;
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_8_4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
