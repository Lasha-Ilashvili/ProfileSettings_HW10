package com.example.profilesettings_hw10.data

import com.example.profilesettings_hw10.R.drawable.ic_bell_notification
import com.example.profilesettings_hw10.R.drawable.ic_group
import com.example.profilesettings_hw10.R.drawable.ic_info
import com.example.profilesettings_hw10.R.drawable.ic_location
import com.example.profilesettings_hw10.R.drawable.ic_privacy
import com.example.profilesettings_hw10.R.drawable.ic_security_check
import com.example.profilesettings_hw10.R.drawable.ic_wallet_payment
import com.example.profilesettings_hw10.model.Setting
import com.example.profilesettings_hw10.model.SettingType

class Datasource {
    fun getSettings() = listOf(
        Setting(),

        Setting(
            settingIcon = ic_location,
            settingText = "Address"
        ),

        Setting(
            settingIcon = ic_bell_notification,
            settingText = "Notification"
        ),

        Setting(
            settingIcon = ic_wallet_payment,
            settingText = "Payment"
        ),

        Setting(
            settingIcon = ic_security_check,
            settingText = "Security"
        ),

        Setting(
            settingType = SettingType.LANGUAGE
        ),

        Setting(
            settingType = SettingType.DARK_MODE
        ),

        Setting(
            settingIcon = ic_privacy,
            settingText = "Privacy Policy",
        ),

        Setting(
            settingIcon = ic_info,
            settingText = "Help Center",
        ),

        Setting(
            settingIcon = ic_group,
            settingText = "Invite Friends",
        ),

        Setting(
            settingType = SettingType.LOGOUT
        )
    )
}