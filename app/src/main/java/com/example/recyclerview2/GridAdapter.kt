package com.example.recyclerview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_grid.view.*

class GridAdapter(private val list:ArrayList<GridData>):RecyclerView.Adapter<GridAdapter.GridVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridVH {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_grid,parent,false)
        return GridVH(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GridVH, position: Int) {
       holder.bind(list[position])
    }

    class GridVH(view: View):RecyclerView.ViewHolder(view) {
        fun bind(data: GridData){
            itemView.tvTitleOne.text=data.title1

        }

    }
}