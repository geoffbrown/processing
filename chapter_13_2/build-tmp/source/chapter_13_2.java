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

public class chapter_13_2 extends PApplet {

// array to keep track of how often random numbers are picked

float[] randomCounts;

public void setup(){
	size(200, 200);
	randomCounts = new float[20];
}

public void draw(){
	background(0);
	//pick a random number and increase the count
	int index = PApplet.parseInt(random(randomCounts.length));
	randomCounts[index]++;
	println("randomCounts[index]: "+randomCounts[index]);
	// draw a rectangle to graph the results
	stroke(0);
	fill(255);
	for (int i = 0; i<randomCounts.length; i++){
		rect(i*10, 0, 9, randomCounts[i]);
		//println("i: "+i);
	}
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_13_2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
