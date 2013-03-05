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

public class chapter_4_15 extends PApplet {

// example 5-9 page 78-79

float x = 100; // x location of square
float y = 0; // y loc of square

float speed = 0; // speed of square
float gravity = .75f; // gravity effect
float decay = -.65f; // set decay

int h = 10; // height
int w = 10; // width

public void setup(){
	size(200, 200);
}

public void draw(){
	background(255);
	// display the square
	fill(0);
	noStroke();
	rect(x, y, w, h);
	/* 
	speed = speed + gravity
	speed now looks like this:
	speed = .1
	speed = .2
	speed = .3, etc
	*/
	speed = speed + gravity;

	// location = location + speed
	y = y + speed;

	// if the square reaches the bottom, reverse the speed

	if (y > height - h){
		// set the position to be on the floor
		y = height - h;
		speed = speed * decay;
	}
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_15" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
