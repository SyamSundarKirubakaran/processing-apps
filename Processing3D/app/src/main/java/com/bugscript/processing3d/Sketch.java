package com.bugscript.processing3d;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

/**
 * Created by syamsundark on 06/03/18.
 */

public class Sketch extends PApplet {
    float angle = 0;
    PShape cube;
    int i=0,j=0;

    public void settings() {
        fullScreen(P3D);
    }

    public void setup() {
        fullScreen(P3D);
        PImage tex = loadImage("google.png");
        cube = createShape(BOX, 400);
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
}
