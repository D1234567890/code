
int x=50;
int y=500;
int finish=900;
void setup() {
  size(1000, 750);
}

void draw() {
background(233,57,367);
ellipse(x,y,100,60);

fill(34,97,223);

    if(mousePressed){
     x=x+10;
    } 




//7. Use this method to play a ding when your dot crosses the finish line. 
if(x==900){
playSound();
}
}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {// Copyright Wintriss Technical Schools 2013
    Minim minim = new Minim(this);        
    AudioSample sound = minim.loadSample("ding2.wav");
    sound.trigger();
    soundPlayed = true;
  }
}




