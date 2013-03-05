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

public class chapter_4_7 extends PApplet {

float r = 150;
float g = 0;
float b = 0;

public void setup(){
	size(200, 200);
}

public void draw(){
	background(r, g, b);
	stroke(255);
	line(width/2, 0, width/2, height);

	if(mouseX > width/2) {
		r = r + 1;
	} else {
		r = r - 1;
	}

	r = constrain(r, 0, 255);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_7" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
