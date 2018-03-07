package com.bugscript.processingdraw

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toast

import processing.android.CompatUtils
import processing.android.PFragment
import processing.core.PApplet

class MainActivity : AppCompatActivity() {
    private var sketch: PApplet? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val frame = FrameLayout(this)
        frame.id = CompatUtils.getUniqueViewId()
        setContentView(frame, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT))

        sketch = Sketch()
        val fragment = PFragment(sketch)
        fragment.setView(frame, this)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (sketch != null) {
            sketch!!.onRequestPermissionsResult(
                    requestCode, permissions, grantResults)
        }
    }

    public override fun onNewIntent(intent: Intent) {
        if (sketch != null) {
            sketch!!.onNewIntent(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.type_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_settings) {
            Toast.makeText(this@MainActivity, "Cleared..", Toast.LENGTH_LONG).show()
            sketch!!.background(0)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
