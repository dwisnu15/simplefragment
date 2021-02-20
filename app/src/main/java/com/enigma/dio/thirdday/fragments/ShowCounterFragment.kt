package com.enigma.dio.thirdday.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enigma.dio.thirdday.R
import kotlinx.android.synthetic.main.fragment_show_counter.*


class ShowCounterFragment : Fragment() {

    var counter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        notif(counter)
    }

    fun notif(counter: Int) {
        counterValue.text = counter.toString()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ShowCounterFragment()

    }
}