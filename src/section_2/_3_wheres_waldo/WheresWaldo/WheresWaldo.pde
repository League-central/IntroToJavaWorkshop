import static javax.swing.JOptionPane.showMessageDialog;
PImage puzzle;
void setup(){
  puzzle = loadImage("whereWaldo3.jpg");
  size(1200,600);
  puzzle.resize(width,height);
  background(puzzle);
  
}

void draw(){
  if(mousePressed){
    println("Mouse’s x-position: " + mouseX + "\n" +
     "Mouse’s y-position: " + mouseY + "\n");
  }   
//  if(mousePressed){
//    if(mouseX > 673 && mouseX < 733){
//      if(mouseY > 253 && mouseY < 313){
//        showMessageDialog(null, "You Found Waldo!");
//      }
//    }
//  }

//  if(mousePressed){
//    if(mouseX > 127 && mouseX < 152){
//        if(mouseY > 304 && mouseY < 327){
//            showMessageDialog(null, "You Found Woof The Dog's Tail!");
//        }
//     }
//  }   

//  if(mousePressed){
//    if(mouseX > 373 && mouseX < 390){
//        if(mouseY > 353 && mouseY < 380){
//            showMessageDialog(null, "You Found Wilma!");
//        }
//    }
//  }

//  if(mousePressed){
//    if(mouseX > 809 && mouseX < 841){
//        if(mouseY > 166 && mouseY < 202){
//            showMessageDialog(null, "You Found Whitebeard!");
//        }
//     }
//   }  


}
