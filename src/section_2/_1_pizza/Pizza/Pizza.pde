PImage bacon;
PImage eyeball;
PImage pizzaBox;
void setup() {
  size(800,800);
  pizzaBox = loadImage("pizzaBox.png");
  pizzaBox.resize(800,800);
  background(pizzaBox);
  fill(#E39800);
  ellipse(400,400, 300,300);
  fill(#FF0000);
  ellipse(400,400, 250,250);
  fill(#FFF300);
  ellipse(400,400, 225,225);
  bacon = loadImage("bacon.png");
  eyeball = loadImage("eyeball.png");
  eyeball.resize(31,31);
  bacon.resize(50,50);
}
void draw() {
  image(bacon,432,412);
  image(bacon,400,300);
  image(bacon,400,400);
  image(eyeball,315,315);
  image(eyeball,380,380);
  image(bacon,315,375);
  image(eyeball,412,293);
  image(eyeball,450,450);
  if(mousePressed && (mouseButton == LEFT)) {
    image(eyeball, mouseX,mouseY);
  } else if(mousePressed && (mouseButton == RIGHT)) {
    image(bacon, mouseX,mouseY);
  }
}
