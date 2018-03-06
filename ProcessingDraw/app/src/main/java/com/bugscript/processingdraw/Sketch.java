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
        i=0;
    }

    public void draw() {
        if(i%2==0){
            fill(84, 242, 95);
        }else{
            fill(219, 50, 208);
        }
        if (mousePressed) {
            ellipse(mouseX, mouseY, 100,100);
            i+=1;
        }
    }

}
