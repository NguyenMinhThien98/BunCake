package com.example.buncake.ui.views.LearningFragmentActivity

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.buncake.R

class LearningFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_learning_fragment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Only add the fragment if it's the first time (i.e., no savedInstanceState)
        if (savedInstanceState == null) {
            val settingFragment = SettingFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.learning_fragment_container, settingFragment)
                .commit()
            Log.d("LearningFragmentActivity", "SettingFragment added.")
        }
    }
}