// 1. Choose a cat image from the "img" folder inside of _3_terminator_cat,
//    and drag and drop it into your processing window

// This line of code creates a variable to hold your cat picture
// You will use it later.
PImage cat;
int x=0;
int y=0;

void setup() {

// 2. The code below loads your cat picture into the program.
//     Change "cat.jpg" to match the name of the image you selected
cat = loadImage("cat.jpg");

// 3. Set the size of the sketch. Make it big enough to show the cat you chose.

// 4. Resize the cat so it is the same size as the sketch

// 5. DRAW CAT.    Use the background() command to make the cat the background of the sketch
//    Run the program to see if the cat is drawn. Get this working before you go on.


  }

void draw() {

// 6. WHERE IS THE EYE? This code prints the x and y locations of the mouse when you click.
//    You can use this to find the x and y for the center of the cat's eyes.
      if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
      }

// 7. Run the program and click on one of the cat's eyes.
//    The x,y position of the eye will be printed at the bottom of your processing window.
//    At the top of the program, set the x and y variable equal to the values you just found


// 8. DRAW CIRCLES.
//     The circles will have black lines around them by default. Put noStroke(); here to remove them.

// 9.  COLOR.  Use the fill() command to set the color of your ellipse to the laser color you would like.

// 10 Use the ellipse() command to draw a circle on the eye (you will have to guess its size).
//    Use the x and y variables you just created to place the ellipse in the correct location.
//                  The ellipse command looks like this:
                ellipse(x, y, width, height);
// Run the program to make sure it is in the right place and is the right size.
}

// 11.  LASER BEAM.  This code will make your ellipse move down and to the right when you press
//      the space bar. Run the program to test it.
//      If you want it to move to the left, change to x-1=.
void keyPressed() {
    x+=1;
    y+=1;

// 12.  If you want them to go faster, add more than one each time the key is pressed
}


//13.   Now make the cat shoot lasers from the other eye.
//      You will need to click the mouse on the other eye to figure our where to draw the other circle
//      Use offsets from the other eye so that you don’t need to make a second set of coordinates.
//      e.g. ellipse(x+220, y-50, 50, 50);

//14.  Set the laser back to the beginning when it goes off the screen.
//     You will need  an if statement to check when x > width
//     Then set x and y back to their original values and re-draw the cat
//     background(cat);
