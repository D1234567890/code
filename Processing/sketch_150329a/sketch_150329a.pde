
PImage villager;
import ddf.minim.*;
AudioPlayer sound;
Minim m;
void setup() {
  size(1000,1000);
  villager = loadImage("villager.png");
  villager.resize(1000,1000);
  m = new Minim(this);
  sound = m.loadFile("hah.wav",2048);
  
}
int REyeX = 310;
int REyeY = 570;
int BEyeX = 770;
int BEyeY = 570;
int RLaserX = 310;
int RLaserY = 570;
int BLaserX = 700;
int BLaserY = 570;
void draw() {
REyeX = mouseX;
REyeY = mouseY;
BEyeX = mouseX;
BEyeY = mouseY;
RLaserX = mouseX;
RLaserY = mouseY;
BLaserX = mouseX;
BLaserY = mouseY;
if(REyeX > 320){
  REyeX = 320;
}
if(REyeY > 577){
  REyeY = 577;
}
if(REyeX < 300){
  REyeX = 300;
}
if(REyeY < 563){
  REyeY = 550;
}
if(BEyeX > 700){
 BEyeX = 700; 
}
if(BEyeY > 577){
 BEyeY = 577; 
}
if(BEyeX > 800){
 BEyeX = 800; 
}
if(BEyeY < 550){
  BEyeY = 550;
}
if(BEyeX < 670){
  BEyeX = 670;
}
image(villager, 0, 0);
ellipse(REyeX,REyeY,100,100);
ellipse(BEyeX,BEyeY,100,100);
fill(0,0,0);
if(mousePressed){
  sound.play();
  line(310,570,RLaserX,RLaserY);
  line(700,570,BLaserX,BLaserY);
  fill(255,0,0);
}

  
}
