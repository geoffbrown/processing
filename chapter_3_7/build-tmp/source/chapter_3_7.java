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

public class chapter_3_7 extends PApplet {

public void setup(){
	size(200, 200);
	background(255);
}

public void draw(){
		
}

public void mousePressed(){
	//when the mouse is pressed...
	stroke(0); // set stroke to black
	fill(175); // set fill to gray
	rectMode(CENTER); // change the rectMode to CENTER
	rect(mouseX, mouseY, 16, 16); // draw a 16x16px square at the mouse loc
}


public void keyPressed(){
	// if any key is pressed...
	background(255); // make the entire stage white
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_3_7" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
