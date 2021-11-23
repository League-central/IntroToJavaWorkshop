import static javax.swing.JOptionPane.showMessageDialog;
PImage puzzle;
void setup(){
  size(1088,672);
  puzzle = loadImage("wheresWaldo2.jpg");
  puzzle.resize(1088,672);
  background(puzzle);
}

boolean disc = false;
boolean disc2 = false;
boolean disc3 = false;
boolean disc4 = false;
boolean disc5 = false;

void draw(){
  if(mousePressed){
    println("Mouse’s x-position: " + mouseX + "\n" +
     "Mouse’s y-position: " + mouseY + "\n");
}   
     int minimumXValue = 457;
     int maximumXValue = 483;
     int minimumYValue = 493;
     int maximumYValue = 547;
     
     int minimum2XValue = 620;
     int maximum2XValue = 628;
     int minimum2YValue = 209;
     int maximum2YValue = 213;
     
     int minimum3XValue = 467;
     int maximum3XValue = 483;
     int minimum3YValue = 398;
     int maximum3YValue = 425;
     
     int minimum4XValue = 706;
     int maximum4XValue = 723;
     int minimum4YValue = 513;
     int maximum4YValue = 535;
     
     int minimum5XValue = 627;
     int maximum5XValue = 649;
     int minimum5YValue = 634;
     int maximum5YValue = 661;
   if(mousePressed){
     //Waldo (#1)
     if(mouseX > minimumXValue && mouseX < maximumXValue){
          if(mouseY > minimumYValue && mouseY < maximumYValue){
              if(disc == false) {
                  showMessageDialog(null, "You Found Waldo!");
                  println("You Found Waldo!");
                  disc = true;
              }
            }
        }
     //Woof the dog...'s tail (#2)
     else if(mouseX > minimum2XValue && mouseX < maximum2XValue){
          if(mouseY > minimum2YValue && mouseY < maximum2YValue){
            if(disc2 == false) {
              //showMessageDialog(null, "You Found Woof the dog...'s tail!");
              println("You Found Woof the dog...'s tail!");
              disc2 = true;
            }
            }
        }
     //Wilma, Waldo's girlfriend (#3)
     else if(mouseX > minimum3XValue && mouseX < maximum3XValue){
          if(mouseY > minimum3YValue && mouseY < maximum3YValue){
            if(disc3 == false) {
              //showMessageDialog(null, "You Found Wilma, Waldo's girlfriend!");
              println("You Found Wilma, Waldo's girlfriend!");
              disc3 = true;
            }
            }
        }
     //Whitebeard the Wizard (#4)
     else if(mouseX > minimum4XValue && mouseX < maximum4XValue){
          if(mouseY > minimum4YValue && mouseY < maximum4YValue){
            if(disc4 == false) {
              //showMessageDialog(null, "You Found Whitebeard the Wizard!");
              println("You Found Whitebeard the Wizard!");
              disc4 = true;
            }
            }
        }
     //Odlaw (or anti-Waldo) (#5)
     else if(mouseX > minimum5XValue && mouseX < maximum5XValue){
          if(mouseY > minimum5YValue && mouseY < maximum5YValue){
            if(disc5 == false) {
              //showMessageDialog(null, "You Found Odlaw (or anti-Waldo)!");
              println("You Found Odlaw (or anti-Waldo)!");
              disc5 = true;
            }
            }
        }
    }
}
