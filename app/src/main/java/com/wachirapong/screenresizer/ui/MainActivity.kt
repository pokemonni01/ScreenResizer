package com.wachirapong.screenresizer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wachirapong.screenresizer.R
import com.wachirapong.screenresizer.ui.screenresizer.ScreenResizerFragment
import com.wachirapong.screenresizer.util.replaceFragmentInActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragmentInActivity(ScreenResizerFragment.newInstance(), R.id.frame_fragment)
    }
}
