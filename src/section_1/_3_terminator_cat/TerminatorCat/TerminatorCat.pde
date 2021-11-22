// 1. Choose a cat image from the "img" folder, and drag and drop it
//    into your processing window

PImage cat;
int x=0;
int y=0;

void setup() {

// 2. Change "cat.jpg" to match the name of the image you selected
cat = loadImage("terminatorCat.png");

// 3. Set the size of the sketch.
size (800,600);
// 4. Resize the cat so it is the same size as the sketch
cat.resize(width,height);
// 5. DRAW CAT. Use the background() command to make the cat the background.
//
background (cat);

  }

void draw() {

// 6. WHERE IS THE EYE? You can use this to find the x and y for the center of the cat's eyes.
      if(mousePressed){
          println(400 + mouseX + 50 + 300 + mouseY + 50);
      }

// 7. Run the program and click on one of the cat's eyes.
//    The x,y position of the eye will be printed at the bottom of your processing window.
//    At the top of the program, set the x and y variable equal to the values you just found


noStroke();

// 8.  COLOR.  Use the fill() command to set the color of your ellipse to the laser color you want.

// 9. Use the ellipse() command to draw a circle on the eye (you will have to guess its size).
//    Use the x and y variables you just created to place the ellipse in the correct location.
//                  The ellipse command looks like this:
                ellipse(x, y, width, height);
// Run the program to make sure it is in the right place and is the right size.
}

// 10.  LASER BEAM.  This code will make your ellipse move down and to the right 
//      when you press the space bar. 
void keyPressed() {
    x+=1;
    y+=1;

// 12.  If you want them to go faster, add more than one each time the key is pressed
}


//13.   Now make the cat shoot lasers from the other eye.

//14.  Set the laser back to the beginning when it goes off the screen.
