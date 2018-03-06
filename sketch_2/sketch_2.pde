float angle = 0;
PShape cube;
int i=0,j=0;

public void setup() {
    fullScreen(P3D);
    PImage tex = loadImage("sketch_1.gif");
    cube = createShape(BOX, 500);
    cube.setTexture(tex);
  }

  public void draw() {
    background(0);
    lights();
    translate(i,j);
    rotateY(angle);
    rotateX(angle*2);
    shape(cube);
    angle += 0.01;
    if(i<width){
      i+=5;
    }else if(j<height){
      j+=5;
    }else{
      i=0;
      j=height/2;
    }
  }