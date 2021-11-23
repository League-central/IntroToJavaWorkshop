
void setup() {
  size(800,600);
  PImage face = loadImage("face5.jpg");
  face.resize(width,height);
  background(face);
}

void draw() {
  fill(mouseX,0,mouseY);
  ellipse(420,275, 50,50);
  ellipse(570,310, 50,50);
  
  fill(#000000);
  ellipse(420,275, 30,30);
  ellipse(570,310, 30,30);
}
