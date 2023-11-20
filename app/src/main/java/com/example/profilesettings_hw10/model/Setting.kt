package com.example.profilesettings_hw10.model

data class Setting(
    val settingIcon: Int,
    val settingText1: String,
    val settingText2: String = "",
    val settingArrow: Int = 0,
    val settingType: SettingType = SettingType.NORMAL
)

enum class SettingType {
    NORMAL,
    LANGUAGE,
    DARK_MODE,
    LOGOUT
}