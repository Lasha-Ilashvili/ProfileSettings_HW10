package com.example.profilesettings_hw10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.profilesettings_hw10.adapter.SettingItemAdapter
import com.example.profilesettings_hw10.data.Datasource
import com.example.profilesettings_hw10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: SettingItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUp()
    }

    private fun setUp() {
        adapter = SettingItemAdapter()
        binding.settingsRecyclerView.adapter = adapter
        adapter.setData(Datasource().getSettings())
    }
}