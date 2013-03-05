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

public class chapter_13_3 extends PApplet {

public void setup(){
	size(200, 200);
	background(255);
	smooth();
	noStroke();
}

public void draw(){
	// probabilities for 3 different cases
	// these need to add up to 100%
	float red_prob = 0.60f;		// 60% chance of red color
	float green_prob = 0.10f; 	// 10% chance of green
	float blue_prob = 0.30f;		// 30% chance of blue

	float num = random(1);		// pick a random num between 0-1

	// if random number is less than .6
	if (num < red_prob){
			fill(255, 53, 2, 150);
		} else if (num < green_prob + red_prob){
			fill(156, 255, 28, 150);
		} else {
			fill(10,52,178,150);
		}

		ellipse(random(width), random(height), 64, 64);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_13_3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
