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

public class chapter_4_12 extends PApplet {

float w = 50;
float h = 50;
float ellipseX;
float ellipseY;
float speed = 1;

public void setup(){
	size(200, 200);
	noStroke();
	ellipseX = width/2;
	ellipseY = height/2;
	smooth();
}

public void draw(){
	background(255);
	fill(0);
	ellipse(ellipseX, ellipseY, 50, 50);

	ellipseX = ellipseX + speed;

	if (ellipseX > width-w/2 || ellipseX < w/2){
		speed = speed * -1;
		/* 
		simply subtracting here won't work
		saying speed = speed - 1 isn't good enough
		the equation above will get instantly rewritten by line 20
		which is ellipseX = ellipseX + speed
		that means we need to reverse the polarity of speed
		by multiplying it by -1
		*/
	}

	// the above code is doing the same thing as the commented
	// out code below, only by using double pipes for OR

	// if (ellipseX > width-w/2){
	// 	speed = speed * -1;
	// }

	// if (ellipseX < w/2){
	// 	speed = speed * -1;
	// }

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_12" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
