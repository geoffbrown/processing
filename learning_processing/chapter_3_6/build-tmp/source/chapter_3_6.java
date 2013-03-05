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

public class chapter_3_6 extends PApplet {

public void setup(){
	size(800, 800); // make the size of the screen 200x200
	background(255); // make the bg white
	smooth(); // smooth 
}

public void draw(){
	
	stroke(0); // make the stroke black
	// strokeWeight(abs(mouseX-pmouseX));
	strokeWeight(abs(pmouseX-mouseX));
	/* The speed of the mouse's horizontal motion is the absolute value of of
	difference between the mouseX and pmouseX */
	line(pmouseX, pmouseY, mouseX, mouseY);
	/* Draw a line from the previous mouse x,y to the current x,y */

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_3_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
