package com.bugscript.processingdraw

import android.view.ViewGroup

import processing.core.PApplet

/**
 * Created by syamsundark on 05/03/18.
 */

class Sketch : PApplet() {
    internal var i = 0

    override fun settings() {
        size(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
    }

    override fun setup() {
        background(0)
        i = 0
    }

    override fun draw() {
        if (i % 2 == 0) {
            fill(84f, 242f, 95f)
        } else {
            fill(219f, 50f, 208f)
        }
        if (mousePressed) {
            rect(mouseX.toFloat(), mouseY.toFloat(), 100f, 100f)
            i += 1
        }

    }

}
