package com.bugscript.processingdraw;

import android.view.ViewGroup;

import processing.core.PApplet;

/**
 * Created by syamsundark on 05/03/18.
 */

public class Sketch extends PApplet {
    int i=0;

    public void settings() {
        size(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

    public void setup() {
        background(0);
        i=0;
    }

    public void draw() {
//        if(i%2==0){
//            fill(84, 242, 95);
//        }else{
//            fill(219, 50, 208);
//        }
//        if (mousePressed) {
//            ellipse(mouseX, mouseY, 100,100);
//            i+=1;
//        }

        stroke(255);
        if(i%2==0){
            fill(66, 134, 244);
        }else{
            fill(244, 65, 68);
        }
        if(mousePressed) {
            triangle(mouseX, mouseY, 58, 20, 150, 150);
            i += 1;
        }

    }

}
