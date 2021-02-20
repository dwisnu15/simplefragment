package com.enigma.dio.thirdday.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.enigma.dio.thirdday.MainActivity
import com.enigma.dio.thirdday.R
import com.enigma.dio.thirdday.SecondActivity
import com.enigma.dio.thirdday.interfaces.CounterInterface
import kotlinx.android.synthetic.main.fragment_counter.*
//for increasing and decreasing counter number
class CounterFragment : Fragment() {

    private lateinit var counterHandler : CounterInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       counterHandler = activity as CounterInterface// call this interface on activity
                                                    //which implements it
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //for button on fragment's id's respective button
        increaseButton.setOnClickListener{
            counterHandler.increment()
        }
            decreaseButton.setOnClickListener{
                counterHandler.decrement()
            }
        }
    }
