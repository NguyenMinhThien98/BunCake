package com.example.buncake.ui.views.LearnActivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.buncake.R

class FormActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var buttonSubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener{
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()
            // Xử lý dữ liệu ở đây
            val intent = Intent(this, GetParamsActivity::class.java).apply {
                putExtra("name", name)
                putExtra("name", name)
            }
            this.startActivity(intent)
        }
    }
}