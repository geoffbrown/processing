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

public class chapter_7_4 extends PApplet {

public void setup(){
	size(200, 200);
}

public void draw(){
	background(0);
	stroke(0);

	// top left square
	fill(distance(0,0,mouseX,mouseY));
	rect(0, 0, width/2-1, height/2-1);

	// top right square
	fill(distance(width,0,mouseX,mouseY));
	rect(width/2, 0, width/2-1, height/2-1);

	// bottom left square
	fill(distance(0,height,mouseX,mouseY));
	rect(0, height/2, width/2-1, height/2-1);

	//bottom right square
	fill(distance(width,height,mouseX,mouseY));
	rect(width/2, height/2, width/2-1, height/2-1);
}

public float distance(float x1, float y1, float x2, float y2) {
	float dx = x1 - x2;
	float dy = y1 - y2;
	float d = sqrt(dx*dx + dy*dy);
	println(d);
	return d;

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_7_4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
