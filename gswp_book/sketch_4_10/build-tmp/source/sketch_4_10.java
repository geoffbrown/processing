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

public class sketch_4_10 extends PApplet {

public void setup(){
	size(480, 220);
	background(0);
	smooth();
	noStroke();

	for (int y = 0; y<=height; y+=40){
		for (int x = 0; x<=width; x+=40){
			fill(255,140);
			ellipse(x,y,40,40);
		}
	}
}

public void draw(){
		
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_4_10" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
