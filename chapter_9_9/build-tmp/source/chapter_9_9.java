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

public class chapter_9_9 extends PApplet {

Car[] cars = new Car[2]; // 100 car objects


public void setup(){
	size(200, 200);
	smooth();

	for (int i = 0; i<cars.length; i++){
		cars[i] = new Car(color(i*2), 0, i*2, i/20.0f);
		// initialize each car using a for loop
	}
}

public void draw(){
		background(255);
		for (int i = 0; i<cars.length; i++){
			cars[i].move();
			cars[i].display();
		}
}
class Car {
	int c;
	float xpos;
	float ypos;
	float xspeed;

	Car(int tempC, float tempXpos, float tempYpos, float tempXspeed) {
		c = tempC;
		xpos = tempXpos;
		ypos = tempYpos;
		xspeed = tempXspeed;
	}

	public void display(){
		stroke(0);
		fill(c);
		rectMode(CENTER);
		rect(xpos, ypos, 20, 10);
	}

	public void move(){
		xpos = xpos + xspeed;
		if (xpos > width){
			xpos = 0;
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_9_9" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
