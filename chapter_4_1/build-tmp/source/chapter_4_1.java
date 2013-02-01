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

public class chapter_4_1 extends PApplet {

int circleX = 100;
int circleY = 100;
// int pWidth = 50;
// int pHeight = 50;



public void setup(){
	size(200, 200);
}

public void draw(){

	int pWidth = mouseX;
int pHeight = mouseY;

		background(255);
		stroke(0);
		fill(175);
		ellipse(mouseX, mouseY, pWidth, pHeight);

		// circleX = circleX + 1;
		// pWidth = pWidth + 1;
		// pHeight = pHeight + 1;
	
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
