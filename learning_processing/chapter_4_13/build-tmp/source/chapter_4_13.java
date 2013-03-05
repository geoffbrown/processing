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

public class chapter_4_13 extends PApplet {

float c1 = 0;
float c2 = 255;

float c1dir = 10.1f;
float c2dir = -10.1f;

public void setup(){
	size(200, 200);
}

public void draw(){
	noStroke();

	//draw rectangle on left
	fill(c1, 0, c2);
	rect(0, 0, width/2, height);

	//draw rectangle on right
	fill(c2, 0, c1);
	rect(width/2, 0, width/2, height);

	//adjust color values
	c1 = c1 + c1dir;
	c2 = c2 + c2dir;

	if (c1 < 0 || c1 > 255){
		//reverse polarity of c1dir
		c1dir = c1dir * -1;
	}

	if (c2 < 0 || c2 > 255){
		c2dir *= -1;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_13" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
