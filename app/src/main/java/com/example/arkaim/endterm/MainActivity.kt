package com.example.arkaim.endterm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById<RecyclerView>(R.id.contacts_recycler).apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }

        val add = findViewById<FloatingActionButton>(R.id.add_button)
        add.setOnClickListener(View.OnClickListener() {
            print("clicked add button")
        })


    }


}
