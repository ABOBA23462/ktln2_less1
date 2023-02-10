package com.example.ktln2_less1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ktln2_less1.data.model.FirstModel
import com.example.ktln2_less1.databinding.ListItem3Binding

class SecondAdapter(

    private var listLanguage : MutableList<FirstModel>

) : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    inner  class SecondViewHolder(private var binding: ListItem3Binding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(catModel: FirstModel) {
            binding.text3.text = catModel.name
            Glide.with(binding.image3.context).load(catModel.icon).into(binding.image3)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(
            ListItem3Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = listLanguage.size

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.onBind(listLanguage[position])
    }
}