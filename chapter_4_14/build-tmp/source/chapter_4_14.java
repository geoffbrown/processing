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

public class chapter_4_14 extends PApplet {

// example 5-8 page 77-78

int x = 0; // x location of square
int y = 0; // y location of square

int speed = 5; // speed of square

int state = 0; // initialize state of square as 0, variable that keeps tract of square moving left/right/up/down

public void setup(){
	size(400, 200);
}

public void draw(){
	background(100);

	// display the square
	noStroke();
	fill(255);
	rect(x, y, 10, 10);

	//conditional to determine which state of the square we're in

	if (state == 0){
			x = x + speed;
			if (x > width-10){
				x = width-10;
				state = 1;
			}
		} else if (state == 1) {
			y = y + speed;
			if (y > height - 10){
				y = height - 10;
				state = 2;
			}
		}else if (state == 2) {
			x = x - speed;
			if (x < 0){
				x = 0;
				state = 3;
			}
		}else if (state == 3) {
			y = y - speed;
			if (y < 0){
				y = 0;
				state = 0;
			}
		}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_14" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
