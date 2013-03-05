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

public class chapter_8_4b extends PApplet {

//Ball myBall1;

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

int ballCount = 0;

int totalBalls = 10;
Ball[] ballArray = new Ball[totalBalls];

public void setup(){
	size(400, 400);
	background(0);
	ballCount++;
	ballArray[ballCount] = new Ball(255,50,50,2,.4f);
	ballArray[ballCount].setPos(mouseX, mouseY);
	// for (int i = 0; i<ballArray.length; i++){
	// 	ballArray[i] = new Ball(255,50,50,2,.4);
	// }

	//myBall1 = new Ball(255,50,50,2,.4);
	//myBall1.setPos(width/2, -100); // initial ball drop
}

public void draw(){
	background(0);
	ballArray[ballCount].display();
	// ballArray[ballCount].update();
	// ballArray[ballCount].resetBall(mouseX, mouseY);

	// for (int i = 0; i<ballArray.length; i++){
	// 	ballArray[i].display();
	// 	ballArray[i].update();
	// 	ballArray[i].resetBall(mouseX, mouseY);
	// }

	//myBall1.resetBall(mouseX, mouseY); // reset ball to mouseX and Y
	//myBall1.display(); // display the ball
	//myBall1.update(); // animate it
}

public void mousePressed(){


	ballCount++;
	println("ballCount: "+ballCount);
	ballArray[ballCount] = new Ball(255,50,50,2,.4f);
	ballArray[ballCount].setPos(mouseX, mouseY);

	//myBall1.setPos(mouseX, mouseY); // set the position of the ball
	// for (int i = 0; i<ballArray.length; i++){
	// 	ballArray[i].setPos(random(mouseX), random(mouseY));
	// }

	//ballCount++;
	//ballArray[ballCount] = new Ball(255,50,50,2,.4);
	//ballArray[ballCount].setPos(random(mouseX), random(mouseY));

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
    String[] appletArgs = new String[] { "chapter_8_4b" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
