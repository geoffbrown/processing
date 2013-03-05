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

public class chapter_6_3 extends PApplet {

int x; // beginning x pos
int y; // beginnign y pos



float w; 
float decrease = 20;// amount to reduce




float xcol = 255;

public void setup(){
	size(400, 400);
	background(255);
	x = width/2;
	y = height/2; 
	w = width; // width
	smooth();
}

public void draw(){

	while (w > 0){
		xcol = xcol - decrease;
		print(xcol);
		noStroke();
		fill(xcol);
		ellipse(x, y, w, w);
		w = w - decrease;
	}

	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_6_3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
