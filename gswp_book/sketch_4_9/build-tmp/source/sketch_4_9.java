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

public class sketch_4_9 extends PApplet {

public void setup(){
  size(480,320);
  smooth();

  stroke(255);
  strokeWeight(1);


}

public void draw(){
	  background(0);
	  for (int i = 20; i<400; i+=20){
  	line(i,0,i+i/2 + mouseX/2,80 + mouseY);
  	// line(i + i/2, 80, i*1.2, 120);
  	line(i, height, i+i/2 + mouseX/2, 80+mouseY);
  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_4_9" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
