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

public class mod extends PApplet {

float mod;

public void setup(){
	size(400, 400);
	println(modulo(9.25f,.5f));

}

public void draw(){
	//	
}

public float modulo(float a_, float b_){
	mod = a_ % b_;
	return mod;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "mod" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
