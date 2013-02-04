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

public class chapter_4_17 extends PApplet {

// beginning of 6/Loops on page 81

int x = 50; // initial x pos for first line
int y = 80; // y pos for all lines
int spacing = 10; // space between lines
int len = 20; // length of each line

int endLegs = 150;

public void setup(){
	size(200, 200);
}

public void draw(){
	stroke(0);
	while (x < endLegs){
		line(x, y, x, y + len);
		x = x + spacing;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_17" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
