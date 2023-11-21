package com.example.profilesettings_hw10.model

import com.example.profilesettings_hw10.R.drawable.ic_arrow
import com.example.profilesettings_hw10.R.drawable.ic_profile

data class Setting(
    val settingIcon: Int = ic_profile,
    val settingText1: String = "",
    val settingArrow: Int = ic_arrow,
    val settingType: SettingType = SettingType.NORMAL
)

enum class SettingType {
    NORMAL,
    LANGUAGE,
    DARK_MODE,
    LOGOUT
}