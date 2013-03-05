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

public class sketch_4_12 extends PApplet {

public void setup(){
	size(480,120);

	smooth();

	fill(255);
	stroke(102);


}

public void draw(){
	background(0);
	for (int y = 20; y<=height-20; y+=10){
		for (int x = 20; x<=width-20; x+=10){
			ellipse(x-width/2+mouseX,y-height/2+(mouseY),4,4);
			line(x-width/2+mouseX,y-height/2+(mouseY),width/2,height/2);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_4_12" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
