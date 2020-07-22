package com.example.recyclerview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    private var spiner :Spinner?=null
    private var btnClick:Button?=null
    private var currentPosition:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        Adapter()
        setSpinner()
        setupListeners()
    }

    private fun initViews(){
       spiner=findViewById(R.id.spinner)
        btnClick=findViewById(R.id.btn)

    }
    private fun Adapter(){
        val adapter=SpinnerAdapter(applicationContext,R.id.txtView,getData())
        spiner?.adapter=adapter

    }
    private fun getData():ArrayList<CustomDataClass>{
        val list= arrayListOf<CustomDataClass>()
        list.add(CustomDataClass(0,"Grid Layout Manager "))
        list.add(CustomDataClass(1,"Linear Layout Manager "))

        return list
    }

    private fun setSpinner(){
        spiner?.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
               
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                currentPosition=position
            }

        }
    }
    private fun setupListeners(){
        btnClick?.setOnClickListener{
            gotoActivity()
        }

    }

    private fun gotoActivity(){
        when(currentPosition){
            0->startActivity(Intent(this,GridActivity::class.java))
            1->startActivity(Intent(this,LinearActivity::class.java))
        }
    }

}