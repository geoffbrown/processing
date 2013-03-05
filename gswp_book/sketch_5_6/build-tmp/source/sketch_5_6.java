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

public class sketch_5_6 extends PApplet {

public void setup(){
	size(512, 512);
	smooth();
	stroke(255);
	background(0);
}

public void draw(){
	strokeWeight(dist(mouseX, mouseY, pmouseX, pmouseY)/4);
	line(mouseX, mouseY, pmouseX, pmouseY);	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_5_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
