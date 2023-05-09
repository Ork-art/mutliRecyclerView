package com.ork.simpleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ork.simpleapp.adapter.SmallNewsAdapter
import com.ork.simpleapp.databinding.ActivityMainBinding
import com.ork.simpleapp.model.BaseModel
import com.ork.simpleapp.model.SmallNewsModel


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = SmallNewsAdapter(myModels as ArrayList<BaseModel>)
        binding.recyclerView.adapter = recyclerView
    }
}