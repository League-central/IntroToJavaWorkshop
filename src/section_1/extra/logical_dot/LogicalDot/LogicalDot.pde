
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  size(600,600);

}
int x = 300;


void draw() {
  
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.
ellipse(x,300,200,200);


// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.
if (x>=600+50) {
  x = 300;
}
if (mousePressed) {
   //  put one color here 
   x+=5;
  fill(#FFC0CB);
} else {
   // put a different color here
  fill(#03F4FF);  
}  
  
  
  
}
