package com.thoughtbeats.pranay.gestures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

   lateinit var mGestureDetector: GestureDetector
    override fun onShowPress(p0: MotionEvent?) {
        //Do nothing
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        rl_gesture.setBackgroundColor(resources.getColor(R.color.colorAccent))
        tv_gesture.text="On Single Tap"
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        rl_gesture.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        tv_gesture.text="On Down confirmed"
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        rl_gesture.setBackgroundColor(resources.getColor(R.color.abc_btn_colored_text_material))
        tv_gesture.text="On Fling"
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
    rl_gesture.setBackgroundColor(resources.getColor(R.color.error_color_material_dark))

    tv_gesture.text="Screen Scrolled"
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        rl_gesture.setBackgroundColor(resources.getColor(R.color.accent_material_light))
        tv_gesture.text="Screen pressed for a while now"
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        rl_gesture.setBackgroundColor(resources.getColor(R.color.switch_thumb_normal_material_light))
        tv_gesture.text="Screen Double tapped"
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mGestureDetector= GestureDetector(this,this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        mGestureDetector.onTouchEvent(event)
        return super.onTouchEvent(event)

    }
}
