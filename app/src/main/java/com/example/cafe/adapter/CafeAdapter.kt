package com.example.cafe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cafe.data.Cafe
import com.example.cafe.databinding.ItemCafeBinding
import android.util.Log

class CafeAdapter(private val cafeList : ArrayList<Cafe>) : RecyclerView.Adapter<CafeAdapter.CafeViewHolder>() {

    inner class CafeViewHolder(private val binding : ItemCafeBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.cafeIv.setOnClickListener {
                Log.d("Error", "${cafeList[adapterPosition]}")

            }
        }
        fun bind(item : Cafe){
            //Databinding to item_cafe.xml
            binding.cafe = item
        }
        fun onClick() {}
    }

    override fun getItemCount(): Int {
        return cafeList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CafeViewHolder {
        val binding = ItemCafeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        Log.d("Error check", "${cafeList}")

        return CafeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CafeViewHolder, position: Int) {
        holder.bind(cafeList[position])
    }


}