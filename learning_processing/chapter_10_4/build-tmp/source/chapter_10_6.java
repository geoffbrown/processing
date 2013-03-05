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

public class chapter_10_6 extends PApplet {

Timer timer;

public void setup(){
	size(200,200);
	background(0);
	timer = new Timer(10);
	timer.start();
}

public void draw(){
	if (timer.isFinished()){
		background(random(255));
		timer.start();
	}
}
class Timer {
	int savedTime;			// when Timer started
	int totalTime;			// How long the timer should last

	Timer(int totalTime_) {
		totalTime = totalTime_;
	}

	public void start() {
		savedTime = millis();
	}

	public boolean isFinished() {
		int passedTime = millis() - savedTime;
		if (passedTime > totalTime){
			return true;
		} else {
			return false;
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_10_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
