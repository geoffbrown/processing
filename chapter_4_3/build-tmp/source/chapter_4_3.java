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

public class chapter_4_3 extends PApplet {

public void setup(){
	size(200, 200);
	frameRate(30);
}

public void draw(){
		background(100);
		stroke(255);
		fill(frameCount/2);
		rectMode(CENTER);
		rect(width/2,height/2,mouseX+10,mouseY+10);
}

public void keyPressed(){
	println(key);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
