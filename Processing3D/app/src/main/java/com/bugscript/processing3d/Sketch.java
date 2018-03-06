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
    int i=0,j=0,z=0;

    public void settings() {
        fullScreen(P3D);
    }

    public void setup() {
        fullScreen(P3D);
        PImage tex = loadImage("pattern.jpg");
        cube = createShape(BOX, 400);
        cube.setTexture(tex);
    }

    public void draw() {
        background(135, 152, 209);
        lights();
        translate(i,j);
        if(mousePressed){
            rotateY(angle);
            rotateX(angle*2);
        }else{
            rotateY(angle);
            rotateX(angle*2);
            angle += 0.01;
            if(i<width){
                i+=5;
            }else if(j<height){
                j+=5;
            }else{
                if(z%2==0){
                    i=0;
                    j=height/2;
                }else if(z%3==0){
                    i=0;
                    j=height/4;
                }else if(z%5==0){
                    i=width/2;
                    j=0;
                }else{
                    i=0;
                    j=height/8;
                }
                z+=1;
            }
        }
        shape(cube);
    }
}
