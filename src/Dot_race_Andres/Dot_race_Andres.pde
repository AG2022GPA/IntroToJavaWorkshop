int x= 50;
int speed=15; 


void setup(){
 size(800,200); 
}
  void draw(){
  background(255,0,0);
  fill(209,174,84);
  if(mousePressed){
x=x+speed;
  
  }
  if( x > 700){
speed=speed * -1;  
  
}
if(x<50){
  speed=speed * -1;
  
  
  
  
  
  
  
  
}
ellipse(x,100,100,100);
}