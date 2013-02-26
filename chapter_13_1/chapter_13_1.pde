// 4 random numbers

float[] randoms = new float[10];
int index = 0; // which number are we using

void setup(){
	size(200, 200);
	// fill array with rando values
	for (int i = 0; i<randoms.length; i++){
		randoms[i] = random(0, 256);
	}
	frameRate(5 );
}

void draw(){
	// every frame we access one element of the array
	background(randoms[index]);
	// and then we go to the next one
	// we use the modulo operator to cycle a couter back to 0
	index = (index + 1) % randoms.length; // index will always stay below the random.length total
	println("index: "+index);	
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