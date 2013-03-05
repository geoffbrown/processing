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

public class chapter_10_5 extends PApplet {

int savedTime;
int totalTime = 5000;		// 5 seconds

public void setup(){
	size(200,200);
	background(0);
	savedTime = millis();
}

public void draw(){
	// calculate how much time has passed
	int passedTime = millis() - savedTime;

	// has 5 seconds pased?
	if (passedTime > totalTime){
		println("5 seconds have passed!");
		background(random(255));
		savedTime = millis();
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_10_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
