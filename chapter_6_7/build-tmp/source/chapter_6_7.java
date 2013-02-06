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

public class chapter_6_7 extends PApplet {

// int y = 0;

// void setup(){
// 	size(200, 200);
// 	background(255);
// 	frameRate(5); // slow it down
// }

// void draw(){
// 	// draw a line
// 	stroke(0);
// 	line(0, y, width, y);
// 	y += 10;

// }

// simple while loop w/ interactivity

public void setup(){
	size(255, 255);
	background(0);
}

public void draw(){
	background(0); // paint the bg black on every frame
	// start with i as 0
	int i = 0;
	// while i is less than the width of the window
	while (i<width){
		noStroke();
		float distance = abs(mouseY - i);
		//println("distance: "+distance);
		fill(distance);
		rect(i, 0, 10, height);
		// increase i by 10;
		i += 10;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_6_7" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
