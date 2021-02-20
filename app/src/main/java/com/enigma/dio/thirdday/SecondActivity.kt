package com.enigma.dio.thirdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.enigma.dio.thirdday.fragments.CounterFragment
import com.enigma.dio.thirdday.fragments.ShowCounterFragment
import com.enigma.dio.thirdday.interfaces.CounterInterface
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.fragment_show_counter.*

class SecondActivity : AppCompatActivity(), View.OnClickListener, CounterInterface {

    private lateinit var counterFragment: CounterFragment
    private lateinit var showCounterFragment: ShowCounterFragment
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        counterFragment = CounterFragment()
        showCounterFragment = ShowCounterFragment()

        counterFragmentButton.setOnClickListener(this)
        counterShowFragmentButton.setOnClickListener(this)
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer,
            counterFragment).commit()
    }

    override fun onClick(view: View?) {
        when(view) {
            counterFragmentButton -> {
                switchFragment(counterFragment)
            }
            counterShowFragmentButton -> {
                showCounterFragment.counter = counter
                switchFragment(showCounterFragment)
            }
        }
    }

    override fun decrement() {
        counter-=1
    }

    override fun increment() {
        counter+=1
    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment).commit()
    }


}