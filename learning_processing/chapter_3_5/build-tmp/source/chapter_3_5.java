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

public class chapter_3_5 extends PApplet {

public void setup(){
	size(200, 200); // make the size of the screen 200x200
	background(255); // make the bg white
	smooth(); // smooth 
}

public void draw(){
	stroke(0); // make the stroke black
	line(pmouseX, pmouseY, mouseX, mouseY);
	/* Draw a line from the previous mouse x,y to the current x,y */

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_3_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
