package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GridActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid2)
        setupView()
        setupAdapter()
    }

    private fun setupView() {
        recyclerView=findViewById(R.id.recyclerView)
    }

    private fun setupAdapter() {
        val adapter=GridAdapter(getData())
        recyclerView?.layoutManager=GridLayoutManager(applicationContext,3)
        recyclerView?.adapter=adapter
    }
    private fun getData():ArrayList<GridData>{
        val data= arrayListOf<GridData>()
        for(i in 1..50){
            data.add(GridData(i, "grid $i"))
        }
        return data

    }
}