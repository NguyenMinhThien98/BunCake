package com.example.buncake.ui.views.setting

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Setting(navHostController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Text("Setting", modifier = Modifier.align(Alignment.Center))
        Button(onClick = { println(" Do function Logout") },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(0.dp)
                .background(color = Color.Red)
            ) {
            Text("Sign out",
                textAlign = TextAlign.Center,
                style =  TextStyle(
                    fontSize = 16.sp,
                )
            )
        }
    }
}