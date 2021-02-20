package com.enigma.dio.thirdday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.enigma.dio.thirdday.fragments.CounterFragment
import com.enigma.dio.thirdday.fragments.ShowCounterFragment
import com.enigma.dio.thirdday.interfaces.CounterInterface
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_show_counter.*

class MainActivity : AppCompatActivity(), CounterInterface {

    private var counter = 0
    private lateinit var counterFragment : CounterFragment
    private lateinit var counterShowFragment : ShowCounterFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment = fragment1 as CounterFragment
        counterShowFragment = fragment2 as ShowCounterFragment
    }

    fun toSecondActivity(view : View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }

    override fun decrement() {
        println("KURANG")
        counter--
        counterShowFragment.notif(counter)
    }

    override fun increment() {
        println("TAMBAH")
        counter++
        counterShowFragment.notif(counter)
    }
}