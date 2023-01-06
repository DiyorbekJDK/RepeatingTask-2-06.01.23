package com.diyorbek.repeatingtask_2_060123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import com.diyorbek.repeatingtask_2_060123.adapter.LigaAdapter
import com.diyorbek.repeatingtask_2_060123.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val ligaAdapter by lazy { LigaAdapter() }
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.rv.apply {
            adapter = ligaAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
        ligaAdapter.submitList(Constantas.list())
        ligaAdapter.onClick = {
            val bundle = bundleOf("liga" to it)
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}