package com.ork.simpleapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ork.simpleapp.databinding.ItemBigNewsBinding
import com.ork.simpleapp.model.BigNewsModel

class BigNewsHolder(
    parent: ViewGroup, private val binding: ItemBigNewsBinding = ItemBigNewsBinding.inflate(
        LayoutInflater.from(parent.context), parent, false
    )
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(bigNewsModel: BigNewsModel){
        binding.title.text = bigNewsModel.title
        binding.discription.text = bigNewsModel.description
    }
}