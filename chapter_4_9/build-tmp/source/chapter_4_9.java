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

public class chapter_4_9 extends PApplet {

float bright0 = 0;
float bright1 = 0;
float bright2 = 0;
float bright3 = 0;

public void setup(){
	size(200, 200);
}

public void draw(){
		background(255);
		stroke(0);
		line(width/2, 0, width/2, height);
		line(0, height/2, width, height/2);

		/* 
		concept, in order:
		draw 4 quads, set their brightness to it's own variable.
		always make the variables decay
		if the mouse is in that quad, turn the brightness all the way up
		*/

		// if the mouse is in the quad, set the quad's brightness to full
		if (mouseX < width/2 && mouseY < height/2) {
			bright0 = 255;
		} else if (mouseX > width/2 && mouseY < height/2){
			bright1 = 255;
		} else if (mouseX < width/2 && mouseY > height/2){
			bright2 = 255;
		} else if (mouseX > width/2 && mouseY > height/2){
			bright3 = 255;
		}

		// always make the variable decay
		bright0 = bright0-10;
		bright1 = bright1-10;
		bright2 = bright2-10;
		bright3 = bright3-10;

		// draw the quads and fill them with the current brightness
		noStroke();
		fill(bright0);
		rect(0, 0, width/2, height/2);
		fill(bright1);
		rect(width/2, 0, width/2, height/2);
		fill(bright2);
		rect(0, height/2, width, height);
		fill(bright3);
		rect(width/2, height/2, width/2, height/2);

		// constrain variables 
		bright0 = constrain(bright0, 0, 255);
		bright1 = constrain(bright1, 0, 255);
		bright2 = constrain(bright2, 0, 255);
		bright3 = constrain(bright3, 0, 255);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "chapter_4_9" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
