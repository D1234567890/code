PImage minecraft;
PImage creeper;
void setup() {
  size(900,700);
  minecraft=loadImage("minecraft.jpg");
  minecraft.resize(900,700);
  creeper=loadImage("creeper.jpg");
  creeper.resize(10,10);
  background(minecraft);
}
int a = 100;
int b = 100;
void draw() {
image(creeper, a, b);
ellipse(700,500,60,60);
if(mousePressed){
 fill(255,0,0); 
}
if(mouseX < 110 && mouseY < 110 && mouseX > 90 && mouseY > 90){
  fill(0,255,0);
}
}




  
  

void keyPressed() {
  
  
  
  
}

