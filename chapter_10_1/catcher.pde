class Catcher
{
	float r;		// radius
	float x,y;		// location

	//--------------------------------------
	//  CONSTRUCTOR
	//--------------------------------------
	
	Catcher (float r_) {
		r = r_;
		x = 0;
		y = 0;
	}

	void setLocation(float x_, float y_){
		x = x_;
		y = y_;
	}

	void display(){
		fill(175);
		ellipse(x, y, r*2, r*2);
	}
}