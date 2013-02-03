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

public class chapter_4_11 extends PApplet {

boolean button = false;

int x = 50;
int y = 50;
int w = 100;
int h = 75;

public void setup(){
	size(200, 200);
}

public void draw(){
	if (button){
			// if the value of button is true, change the background to white
			background(255);
			stroke(0);
		} else {
			background(0);
			stroke(255);
		}
	fill(175);
	rect(x, y, w, h);
}

public void mousePressed(){
	if (mouseX > x && mouseX < x+w && mouseY>y && mouseY<y+h){
		button = !button;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_11" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
