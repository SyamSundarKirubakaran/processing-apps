package com.bugscript.processingdraw;

import android.view.ViewGroup;

import processing.core.PApplet;

/**
 * Created by syamsundark on 05/03/18.
 */

public class Sketch extends PApplet {

    public void settings() {
        size(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }

}
