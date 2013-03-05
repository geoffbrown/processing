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
		noStroke();
		ellipse(x, y, r*2, r*2);
	}

	boolean intersect(Drop d){
		// calculate the distance
		float distance = dist(x, y, d.x, d.y);
		// compare the distance to the sum of radii
		if (distance < r + d.r){
			return true;
		} else {
			return false;
		}
	}

}