package com.example.recyclerview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_linear.view.*

class LinearAdapter(private val list:ArrayList<String>) :RecyclerView.Adapter<LinearAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_linear, parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun bind(item:String){
            itemView.title1.text=item
        }


    }

}