
void setup() {
 
  // set the size of your sketch
  size(600,600);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  
  for(int i=300;i>50;i-=30)
 {
 
   if(i%20==0)
   {
    fill(300,0,0);
   }
   else
   {
    fill(0,0,0); 
   }  
   ellipse(300,300,i,i);
}
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
