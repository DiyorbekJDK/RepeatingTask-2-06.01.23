package com.diyorbek.repeatingtask_2_060123.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.repeatingtask_2_060123.databinding.TeamLayoutBinding
import com.diyorbek.repeatingtask_2_060123.model.Team

class TeamAdapter : ListAdapter<Team, TeamAdapter.TeamViewHolder>(DiffCallBack()) {
    private class DiffCallBack : DiffUtil.ItemCallback<Team>() {
        override fun areItemsTheSame(oldItem: Team, newItem: Team): Boolean {
            return oldItem.d1 == newItem.d1
        }

        override fun areContentsTheSame(oldItem: Team, newItem: Team): Boolean {
            return oldItem == newItem
        }
    }

    inner class TeamViewHolder(
        private val binding_two: TeamLayoutBinding
    ) : RecyclerView.ViewHolder(binding_two.root) {
        fun bind(team: Team) {
            binding_two.teamImage.setImageResource(team.image)
            binding_two.teamName.text = team.name
            binding_two.liga1D.text = team.d1
            binding_two.liga2D.text = team.d2
            binding_two.liga3D.text = team.d3
            binding_two.liga4D.text = team.d4
            binding_two.liga5D.text = team.d5
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        return TeamViewHolder(
            TeamLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}