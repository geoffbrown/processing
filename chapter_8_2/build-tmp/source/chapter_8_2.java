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

public class chapter_8_2 extends PApplet {

Car myCar1;
Car myCar2;

public void setup(){
	size(200, 200);

	myCar1 = new Car(color(255,0,0), 0, 100, 2);
	myCar2 = new Car(color(0,0,255), 0, 10, 1);
}

public void draw(){
		background(255);
		myCar1.move();
		myCar1.display();
		myCar2.move();
		myCar2.display();
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
			xpos *= -1;
			println(xpos);

		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_8_2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
