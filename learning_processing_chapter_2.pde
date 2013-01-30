// This is a comment

size(200,200);
// setting the size of the screen to 200by200px

background(255);
// setting the background of the app to white

rectMode(CENTER);
// telling rectangles to start drawing from the center

stroke(0);
// sets stroke to black

fill(150);
// sets fill to a gray

rect(100,100,20,100, 4);
/* draw the body – initial rectangle, 100px x 100px y to the center, 
20px wide, 100px tall - the last 4 adds a chamfur rounded corner*/ 

fill(255);
//change the fill to white

ellipse(100,70,60,60);
// draw the head - 100px x, 70px y down, 60 wide 60 tall


fill(0);
//change fill back to black

ellipse(81,70,16,32);
/*draw eye 1
ellipse 81px over x, 70 down y, 16 wide, 32 tall 
*/

ellipse(119,70,16,32);
/*draw eye 2 38 px over
ellipse 119px over x, 70 down y, 16 wide, 32 tall 
*/

stroke(0);
// change stroke to black

line(90,150,80,160);
/* draw foot 1 - 
start point 1 at 90px x, 150px y 
draw to point 2 at 80px x, 160px y 
this makes the line proceed to the right and down by 10px
*/

line(110, 150, 120, 160);
/*draw foot 2
remember, body is 20px wide
start point 1 at 110, and down 150
draw point 2 at +10 pix to the right and 10px down)

*/

println("take me to your leader!");
