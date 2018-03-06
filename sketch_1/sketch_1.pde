int i;
void setup() {
  size(500,400);
  background(0);
  i=0;
}


void draw() {
  if (mousePressed) {
    background(0);
    i=0;
  }

  stroke(255);
  if(i%2==0){
    fill(66, 134, 244);
  }else{
    fill(244, 65, 68);
  }
  ellipse(mouseX, mouseY, 100, 100);
  i+=1;
}