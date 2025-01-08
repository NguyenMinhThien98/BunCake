package com.example.buncake.ui.views.LearningFragmentActivity

import androidx.fragment.app.Fragment

interface SettingItem {
    val leftIcon: Int
    val title: String
    val rightIcon: Int
    val fragment : Fragment
}