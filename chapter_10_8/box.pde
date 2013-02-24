class Box {

	int x;
	int y;
	int w;
	color c;

	Box(int x_, int y_, int w_, color c_){
		x = x_;
		y = y_;
		w = w_;
		c = c_;
	}

	void display(){
		noStroke();
		fill(c);
		rect(x, y, w, w);
	}

}