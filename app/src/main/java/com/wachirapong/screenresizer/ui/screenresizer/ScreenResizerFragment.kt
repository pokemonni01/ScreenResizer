package com.wachirapong.screenresizer.ui.screenresizer


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.wachirapong.screenresizer.R

class ScreenResizerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_resizer, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ScreenResizerFragment()
    }
}
