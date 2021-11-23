void setup() {
  size (800, 600);

  PImage pizzaBox = loadImage("pizzaBox.png");
  pizzaBox.resize(800,600);      //to match your canvas size
  background(pizzaBox);       //in setup method

  fill(#C9C17C);
  ellipse(400, 400, 300, 300);

  fill(#FF5555);
  ellipse(400, 400, 250, 250);

  fill(#CFDB2E);
  ellipse(400, 400, 230, 230);
}

void draw() {
  PImage eyeball;
  eyeball = loadImage("eyeball.png");
  eyeball.resize(30, 30);
  image(eyeball, 450, 450);
  image(eyeball, 350, 450);
  image(eyeball, 450, 350);
  image(eyeball, 350, 350);
  image(eyeball, 400, 400);
  
  if (mousePressed && (mouseButton == LEFT)) {
    image(eyeball, mouseX - 20, mouseY - 20);
  }
  
  
  PImage pickle;
  pickle = loadImage("pickle.png");
  pickle.resize(30, 30);
  image(pickle, 430, 400);
  image(pickle, 330, 400);
  image(pickle, 430, 300);
  image(pickle, 330, 300);
  image(pickle, 370, 400);
  
  if (mousePressed && (mouseButton == RIGHT)) {
    image(pickle, mouseX - 20, mouseY - 20);
  }
}
