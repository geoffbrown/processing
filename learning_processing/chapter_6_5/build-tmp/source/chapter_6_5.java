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

public class chapter_6_5 extends PApplet {

int subtr = 40;

public void setup(){
  size(600,600);
  smooth();
}

public void draw(){
  background(255); // make background white
  for (float i = width; i > 0; i -= subtr) {
  	/*
	i = width of screen
	run if i is greater than 0
	every loop width is decremented by 20
  	*/
    // stroke(0);
    // noStroke();
    stroke(250);
    fill(i);
    println(i);
    ellipse(width/2,height/2,i,i);
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_6_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
