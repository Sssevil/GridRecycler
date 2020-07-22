package com.example.recyclerview2

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.security.AccessControlContext

class SpinnerAdapter(context: Context, resource: Int,private val objects: MutableList<CustomDataClass>):
    ArrayAdapter<CustomDataClass>(context, resource, objects){
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(context).inflate(R.layout.item_spinner,parent,false)
        val tvTitle=view.findViewById<TextView>(R.id.txtView)
        tvTitle.text=objects[position].title
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(context).inflate(R.layout.item_spinner,parent,false)
        val tvTitle=view.findViewById<TextView>(R.id.txtView)
        tvTitle.text=objects[position].title
        return view
    }


}