package com.example.buncake.core

import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.buncake.ui.views.HomeScreen
import com.example.buncake.ui.views.LearnActivity.LearningActivity
import com.example.buncake.ui.views.setting.Setting

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = settingScreen.name,
        enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
        exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
        popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
        popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) }
    ) {
        composable(homeScreen.name) {
            HomeScreen(
                navHostController = navController
            )
        }

        composable(learningActivity.name) {
            LearningActivity(
                navHostController = navController
            )
        }

        composable(settingScreen.name){
            Setting(
                navHostController =  navController
            )
        }
    }
}