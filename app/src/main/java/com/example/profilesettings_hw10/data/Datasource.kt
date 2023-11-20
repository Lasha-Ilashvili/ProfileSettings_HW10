package com.example.profilesettings_hw10.data

import com.example.profilesettings_hw10.R.drawable.ic_arrow
import com.example.profilesettings_hw10.R.drawable.ic_bell_notification
import com.example.profilesettings_hw10.R.drawable.ic_eye_dark_mode
import com.example.profilesettings_hw10.R.drawable.ic_group
import com.example.profilesettings_hw10.R.drawable.ic_info
import com.example.profilesettings_hw10.R.drawable.ic_language_dots
import com.example.profilesettings_hw10.R.drawable.ic_location
import com.example.profilesettings_hw10.R.drawable.ic_logout
import com.example.profilesettings_hw10.R.drawable.ic_privacy
import com.example.profilesettings_hw10.R.drawable.ic_profile
import com.example.profilesettings_hw10.R.drawable.ic_security_check
import com.example.profilesettings_hw10.R.drawable.ic_wallet_payment
import com.example.profilesettings_hw10.model.Setting
import com.example.profilesettings_hw10.model.SettingType

class Datasource {
    fun getSettings() = listOf(
        Setting(
            settingIcon = ic_profile,
            settingText1 = "Edit Profile",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_location,
            settingText1 = "Address",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_bell_notification,
            settingText1 = "Notification",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_wallet_payment,
            settingText1 = "Payment",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_security_check,
            settingText1 = "Security",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_language_dots,
            settingText1 = "Language",
            settingText2 = "English (US)",
            settingArrow = ic_arrow,
            settingType = SettingType.LANGUAGE
        ),
        Setting(
            settingIcon = ic_eye_dark_mode,
            settingText1 = "Dark Mode",
            settingType = SettingType.DARK_MODE
        ),
        Setting(
            settingIcon = ic_privacy,
            settingText1 = "Privacy Policy",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_info,
            settingText1 = "Help Center",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_group,
            settingText1 = "Invite Friends",
            settingArrow = ic_arrow
        ),
        Setting(
            settingIcon = ic_logout,
            settingText1 = "Logout",
            settingType = SettingType.LOGOUT
        )
    )
}