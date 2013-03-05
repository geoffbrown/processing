// fig 6.5 page 84


int h = 5; // hight of rectangle
int space = h + 2; // set the recs 10 px apart each

int x = 10; // place to start all recs on the x axis
int y = 0; // place to begin the y for looping
int w; // initialie w variable for setup call



void setup(){
	size(150, 400);
	background(255);
	w = width - x*2; // width of rect
}

void draw(){
	
	while (y < height){
		rect(x, y, w, h);
		y = y + space;
	}

}
