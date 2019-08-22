package com.example.mun

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {
    private lateinit var videoView: VideoView
    private lateinit var textView: TextView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.fragment_home, container, false)
        videoView = v.findViewById(R.id.videoView) as VideoView
        videoView!!.setVideoURI(Uri.parse("android.resource://" + requireActivity().packageName + "/" + R.raw.m))
        videoView!!.start()
        return  inflater.inflate(R.layout.fragment_home, container, false)
    }
}