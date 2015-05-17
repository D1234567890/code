boolean display = false;
int d = 50;
void setup(){
 size(900,700);
  
  
  
}
void draw(){
  background(d,0,0);
  if(keyPressed){
    d+=50;
  }
  fill(255, 255, 255);
  ellipse(a,b,60,60);
  fill(0, 0, 0);
  if(display){ 
   textSize(30);
   text(num,a-10,b+10);
  if(mousePressed){
   num=0; 
  }
  }
  
  
}
int a = 350;
int b = 450;
int num = 0;
void keyPressed(){
  if(keyCode==LEFT){
   a-=10; 
  }
  if(keyCode==RIGHT){
   a+=10; 
  }
  if(keyCode==UP){
   b-=10; 
  }
  if(keyCode==DOWN){
   b+=10; 
  }
  if(key=='1'){
   num++;
  }
  if(key=='2'){
   num+=2;
  }
  if(key=='3'){
   num+=3;
  }
  if(key=='4'){
   num+=4;
  }
  if(key=='5'){
   num+=5;
  }
  if(key=='6'){
   num+=6;
  }
  if(key=='7'){
   num+=7;
  }
  if(key=='8'){
   num+=8;
  }
  if(key=='9'){
   num+=9;
  }
  if(keyCode==ENTER){
   display = true;
  }
  
  
  
}
