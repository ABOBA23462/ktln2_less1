package com.example.ktln2_less1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ktln2_less1.data.model.FirstModel
import com.example.ktln2_less1.databinding.ListItem3Binding

class ThirdAdapter(
    private var listCinema : MutableList<FirstModel>
) : RecyclerView.Adapter<ThirdAdapter.CinemaViewHolder>() {

    inner class CinemaViewHolder(private var binding: ListItem3Binding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(thirdModel : FirstModel){
            binding.text3.text = thirdModel.name
            Glide.with(binding.image3.context).load(thirdModel.icon).into(binding.image3)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        return CinemaViewHolder(
            ListItem3Binding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun getItemCount(): Int = listCinema.size

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.onBind(listCinema[position])
    }
}