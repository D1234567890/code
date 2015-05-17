void setup()
{
  size(2000,1000);
PImage face = loadImage("happy.png");
face.resize(200, 200);
  image(face,0,0);
  
}
void draw()
{
  ellipse(75,75,20,50);
  ellipse(120,75,20,50);
 fill(mouseX,mouseY,255);
 
  
  
  
}
