void setup() {
  size(1500,800);
  
  
  
}
void draw() {
  for(int a = 100; a > 10; a-=5) {
    ellipse(700,400,a,a);
  }
   for(int b = 100; b > 10; b-=5) {
    ellipse(x,400,b,b);
  }
  
  
}
int x = 800;
void keyPressed() {
  if(keyPressed == TAB) {
    x-=10;
  }
  
  
  
}
