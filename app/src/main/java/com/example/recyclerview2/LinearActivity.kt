package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class LinearActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)
        setupViews()
        setupAdapters()
    }
    private fun setupViews() {
        recyclerView=findViewById(R.id.recyclerViewLine)
    }

    private fun setupAdapters() {
        val list= arrayListOf<String>()
        for(i in 1..50){
            list.add("Phone $i")
        }
        val adapter=LinearAdapter(list)
        recyclerView?.adapter=adapter
    }



}