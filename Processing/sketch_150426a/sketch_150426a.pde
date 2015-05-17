PShape z;
void setup() {
  size(900,700);
}
void draw() {
  if(mousePressed){
  float a = random(500);
  float b = random(500);
  fill(random(255),random(255),random(255));
  ellipse(random(900),random(700),a,b);
  triangle(random(900),random(700),random(900),random(700),random(900),random(700));
  rect(random(900),random(700),a,b);
  
  }

  
}

