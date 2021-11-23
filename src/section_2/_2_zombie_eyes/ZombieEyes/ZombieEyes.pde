PImage face;
void setup() {
  face = loadImage("face5.jpg");
  size(800,800);
  face.resize(800,800);
  background(face);
 
}

void draw() {
  fill(255,mouseX/3,mouseY/3);
  ellipse(415,373,45,45);
  ellipse(565,411,45,45);
  fill(0,mouseY/3,mouseX/3);
  ellipse(415,373,23,23);
  ellipse(565,411,23,23);
}
