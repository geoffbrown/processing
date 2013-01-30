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

public class chapter_3 extends PApplet {

public void setup(){
  //set the size of the window
  size(200,200);
}

public void draw(){
  //draw a white background
  background(255);


//Set CENTER mode
ellipseMode(CENTER);
rectMode(CENTER);

//Draw Zoog's body
stroke(0);
fill(150);
rect(100,100,20,100, 4);

// Draw Zoog's head
stroke(0);
fill(255);
ellipse(100,70,60,60);

// Draw Zoog's eyes
fill(0);
ellipse(81, 70, 16, 32);
ellipse(119, 70, 16, 32);

//Draw Zoog's legs
stroke(0);
line(90, 150, 80, 160);
line(110, 150, 120, 160);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
