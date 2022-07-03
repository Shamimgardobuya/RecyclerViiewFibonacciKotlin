package com.example.fibonaccirecycling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonaccirecycling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        summing(101)
        var numbList=summing(100)
        println(numbList)
        binding.rvFibo.layoutManager=LinearLayoutManager(this)
        binding.rvFibo.adapter=fibonacciAdapterView(numbList)
    }
        fun summing(size:Int):List<Int>{
            var numb= listOf<Int>()
            var start=0
            var secondStart=1
            var item=0
            while (item<size){
                var thirdStart=start+secondStart

                start=secondStart
                secondStart=thirdStart
                item++
                numb+=secondStart

            }          //instance  of view

          return numb
    }

}