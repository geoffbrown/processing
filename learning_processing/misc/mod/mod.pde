float mod;

void setup(){
	size(400, 400);
	println(modulo(9.25,.5));

}

void draw(){
	//	
}

float modulo(float a_, float b_){
	mod = a_ % b_;
	return mod;
}

/*

                      .                                  
   ___  _  .- \,___,  |     ___  ` , __   ` , __     ___.
 .'   `  \,'  |    \  |    /   ` | |'  `. | |'  `. .'   `
 |----'  /\   |    |  |   |    | | |    | | |    | |    |
 `.___, /  \  |`---' /\__ `.__/| / /    | / /    |  `---|
              \                                     \___/
 __    __     ______     _____     __  __     __         ______    
/\ "-./  \   /\  __ \   /\  __-.  /\ \/\ \   /\ \       /\  __ \   
\ \ \-./\ \  \ \ \/\ \  \ \ \/\ \ \ \ \_\ \  \ \ \____  \ \ \/\ \  
 \ \_\ \ \_\  \ \_____\  \ \____-  \ \_____\  \ \_____\  \ \_____\ 
  \/_/  \/_/   \/_____/   \/____/   \/_____/   \/_____/   \/_____/ 
                                                                   

okay, so why can't I figure out modulo. it's easy:

it's not division. to rough out the answer, I can say something like this:

how many times does number B fit into number A? The remainer is modulo.

So, for 4 mod 5, or 4 % 5, the answer is 4

why?

5 goes into 4 exactly ZERO times. the remainder is 4.

let's try another.

13 mod 3…

modulo = 1
the QUOTIENT = 4

cool? yep.


*/