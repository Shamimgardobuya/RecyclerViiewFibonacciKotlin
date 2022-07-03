package com.example.fibonaccirecycling

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class fibonacciAdapterView (var numbList:List<Int>):
    RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView= LayoutInflater.from(parent.context)     //makes our layout to view/where we will display
            .inflate(R.layout.number_list_fibo,parent,false)  //draw list to my layout
       return NumbersViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvFibo.text= numbList.get(position).toString()   //
//for binding.

    }

    override fun getItemCount(): Int {
        return numbList.size      //size of list


    }
}
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)                              {
    var tvFibo = itemView.findViewById<TextView>(R.id.tvFibo)
}