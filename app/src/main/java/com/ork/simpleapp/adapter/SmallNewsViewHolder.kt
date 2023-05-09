package com.ork.simpleapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ork.simpleapp.databinding.ItemSmallNewsBinding
import com.ork.simpleapp.model.SmallNewsModel

class SmallNewsViewHolder(
    parent: ViewGroup, private val binding: ItemSmallNewsBinding = ItemSmallNewsBinding.inflate(
        LayoutInflater.from(parent.context), parent, false
    )
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(newsModel: SmallNewsModel) {
        binding.title.text = newsModel.title

    }
}
