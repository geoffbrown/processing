float pAlpha = 0.0; // set color of blocks to black
float pAlph_inc; // instantiate the holder for the color divider

int totalRecs = 100; // total number of rectangles to display
int w; // instantiate the width
int x = 0; // set the initial x pos to 0

void setup(){
  size(900,200);
  w = width/totalRecs; // set the width of each rec 
  pAlph_inc = 255.0/totalRecs; // divide the color spectrum up over total recs setting a float - not having the .0 there won't let it run
  background(255); // set the bg to white
  // count up to the total number of recs I've specified
  for (int i = 0; i<totalRecs; i++) {
  	noStroke(); // turn off stroke
  	pAlpha+=pAlph_inc; // add the increment every time the loop runs to the original black
  	fill(pAlpha); // fill it with the color I've just set
  	rect(x, 0, w, height); // draw the rec with the x and w i've set
  	x = x + w; //increment the x pos by adding the width
  }
}

void draw(){
  //
 
}

