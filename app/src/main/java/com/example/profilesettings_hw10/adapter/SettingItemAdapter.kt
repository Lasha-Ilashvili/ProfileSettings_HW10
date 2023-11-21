package com.example.profilesettings_hw10.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.profilesettings_hw10.databinding.SettingDarkModeBinding
import com.example.profilesettings_hw10.databinding.SettingItemBinding
import com.example.profilesettings_hw10.databinding.SettingLanguageBinding
import com.example.profilesettings_hw10.databinding.SettingLogoutBinding
import com.example.profilesettings_hw10.model.Setting
import com.example.profilesettings_hw10.model.SettingType

class SettingItemAdapter() :
    ListAdapter<Setting, RecyclerView.ViewHolder>(object : DiffUtil.ItemCallback<Setting>() {

        override fun areItemsTheSame(oldItem: Setting, newItem: Setting): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItem: Setting, newItem: Setting): Boolean {
            TODO("Not yet implemented")
        }
    }) {

    private companion object {
        const val NORMAL_SETTING = 1
        const val LANGUAGE_SETTING = 2
        const val DARK_MODE_SETTING = 3
        const val LOGOUT_SETTING = 4
    }

    fun setData(settings: List<Setting>) {
        submitList(settings)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (viewType) {
        LANGUAGE_SETTING -> SettingLanguageViewHolder(
            SettingLanguageBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

        DARK_MODE_SETTING -> SettingDarkModeViewHolder(
            SettingDarkModeBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

        LOGOUT_SETTING -> SettingLogoutViewHolder(
            SettingLogoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

        else -> SettingItemViewHolder(
            SettingItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }


    override fun getItemCount() = currentList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SettingItemViewHolder) {
            holder.bind()
        }
    }

    override fun getItemViewType(position: Int) = when (currentList[position].settingType) {
        SettingType.LANGUAGE -> LANGUAGE_SETTING
        SettingType.DARK_MODE -> DARK_MODE_SETTING
        SettingType.LOGOUT -> LOGOUT_SETTING

        else -> NORMAL_SETTING
    }

    inner class SettingItemViewHolder(private val binding: SettingItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            val setting = currentList[adapterPosition]

            with(binding) {
                ivSettingsIcon.setImageResource(setting.settingIcon)
                tvSettingsText.text = setting.settingText
                ivSettingsArrow.setImageResource(setting.settingArrow)
            }
        }
    }

    inner class SettingLanguageViewHolder(private val binding: SettingLanguageBinding) :
        RecyclerView.ViewHolder(binding.root)

    inner class SettingDarkModeViewHolder(private val binding: SettingDarkModeBinding) :
        RecyclerView.ViewHolder(binding.root)

    inner class SettingLogoutViewHolder(private val binding: SettingLogoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}