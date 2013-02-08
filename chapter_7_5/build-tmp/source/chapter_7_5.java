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

public class chapter_7_5 extends PApplet {

//on page 109

int x = 100;
int y = 100;
// int thesize = 64;
// int offset = thesize/4;

public void setup(){
	size(200, 200);
	background(255);
}

public void draw(){
	background(255);
	drawCar(100,100,64,color(200,200,0));
	drawCar(50,75,32,color(0,200,100));
	drawCar(80,175,40,color(200,0,0));
}

public void drawCar(int x, int y, int thesize, int c) {
	// using a local variable 'offset'
	int offset = thesize/4;
	// draw main car body
	rectMode(CENTER);
	stroke(0);
	fill(c);
	rect(x,y,thesize,thesize/2);
	// draw four wheels, relative to the center
	fill(0);
	rect(x-offset, y-offset, offset, offset/2);
	rect(x+offset, y-offset, offset, offset/2);
	rect(x-offset, y+offset, offset, offset/2);
	rect(x+offset, y+offset, offset, offset/2);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_7_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
