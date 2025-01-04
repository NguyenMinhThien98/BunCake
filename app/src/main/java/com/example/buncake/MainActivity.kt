package com.example.buncake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.buncake.core.Navigation
import com.example.buncake.ui.theme.BunCakeTheme
import com.example.buncake.ui.views.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainComposable()
        }
    }
}

@Composable
fun MainComposable() {
    BunCakeTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Surface (modifier = Modifier.padding(innerPadding)) {
                Navigation()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Preview() {
    MainComposable()
}