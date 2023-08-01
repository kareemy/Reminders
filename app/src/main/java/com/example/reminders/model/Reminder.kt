package com.example.reminders.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Reminder(
    @StringRes val day: Int,
    @DrawableRes val image: Int,
    @StringRes val reminderText: Int
)
