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

public class chapter_8_5 extends PApplet {

Ball ball1;
Ball ball2;

float gravity = 0.1f;

public void setup(){
	size(200, 200);
	smooth();

	// create new ball objs
	ball1 = new Ball(50,0,16);
	ball2 = new Ball(100,50,32);
}

public void draw(){

	background(255);

	ball1.display();
	ball2.display();

	ball1.update();
	ball2.update();
		
}
class Ball {
	float x;
	float y;
	float speed;
	float w; 

	Ball(float tempX, float tempY, float tempW) {
		x = tempX;
		y = tempY;
		w = tempW;
		speed = 0;
	}

	public void display(){
		fill(175);
		stroke(0);
		ellipse(x, y, w, w);
	}

	public void update() {
		y = y + speed;
		speed = speed + gravity;

		if (y>height){
			speed = speed *-0.95f;
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_8_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
