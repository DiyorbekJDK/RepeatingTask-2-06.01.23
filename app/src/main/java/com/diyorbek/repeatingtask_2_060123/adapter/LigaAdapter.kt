package com.diyorbek.repeatingtask_2_060123.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.repeatingtask_2_060123.MainActivity
import com.diyorbek.repeatingtask_2_060123.databinding.ItemLayoutBinding
import com.diyorbek.repeatingtask_2_060123.model.Liga

class LigaAdapter : ListAdapter<Liga, LigaAdapter.LigaViewHolder>(DiffCallBack()) {
    lateinit var context: Context
    lateinit var onClick: (Liga) -> Unit

    private class DiffCallBack : DiffUtil.ItemCallback<Liga>() {
        override fun areItemsTheSame(oldItem: Liga, newItem: Liga): Boolean {
            return oldItem.ligaName == newItem.ligaName
        }

        override fun areContentsTheSame(oldItem: Liga, newItem: Liga): Boolean {
            return oldItem == newItem
        }
    }

    inner class LigaViewHolder(
        private val binding: ItemLayoutBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(liga: Liga) {
            val adapter2 = TeamAdapter()
            binding.ligaImage.setImageResource(liga.ligaImg)
            binding.ligaName.text = liga.ligaName
            binding.ligaCity.text = liga.ligaCIty
            adapter2.submitList(liga.ligaTeam)
            binding.recyclerView.apply {
                adapter = adapter2
                layoutManager = LinearLayoutManager(context)
            }
            itemView.setOnClickListener {
                onClick(liga)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LigaViewHolder {
        context = parent.context
        return LigaViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
        )
    }

    override fun onBindViewHolder(holder: LigaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}