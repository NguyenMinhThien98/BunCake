package com.example.buncake.ui.views.LearnActivity

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.example.buncake.model.FiringRobot


@Composable
fun LearningActivity(navHostController: NavHostController) {
    val context = LocalContext.current
    val firingRobot1 = FiringRobot(name = "Robot 1", modelYear = "2023")
    firingRobot1.firing()
    firingRobot1.start()

    val handleOnclick = {
        val intent = Intent(context, FormActivity::class.java)
        context.startActivity(intent)
    }

    val onClick = {
        val intent = Intent(context, FormActivity::class.java)
        context.startActivity(intent)
    }


    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = onClick
        ) {
            Text("Go to Activity ")
        }
    }
}


