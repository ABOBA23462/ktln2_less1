package com.example.ktln2_less1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ktln2_less1.data.model.FirstModel
import com.example.ktln2_less1.databinding.ListItemBinding
import com.example.ktln2_less1.ui.fragments.FirstFragment

class FirstAdapter(

    private var listCat : MutableList<FirstModel>,
    private var onItemTextListener: FirstFragment

) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    inner  class FirstViewHolder(private var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(firstModel: FirstModel){
            binding.text.text = firstModel.name
            Glide.with(binding.image.context).load(firstModel.icon).into(binding.image)
            itemView.setOnClickListener {
                onItemTextListener.onClickListener(firstModel)
                binding.text.text = firstModel.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = listCat.size

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }
}