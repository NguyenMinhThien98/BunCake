package com.example.buncake.ui.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.buncake.core.learningActivity
import com.example.buncake.core.settingScreen
import com.example.buncake.ui.theme.buttonColor

@Composable
fun HomeScreen(navHostController: NavHostController) {
    val screenList: MutableState<List<String>> = remember {
        mutableStateOf(
            listOf(
                learningActivity.name,
                settingScreen.name
            )
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            items(screenList.value.size) { index ->
                val screen = screenList.value[index]
                Box(
                    modifier = Modifier
                        .fillParentMaxWidth()
                        .padding(vertical = 16.dp)
                ) {
                    Button(
                        onClick = {
                           navHostController.navigate(screen)
                        },
                        modifier = Modifier
                            .align(Alignment.Center)
                            .width(250.dp)
                            .padding(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = buttonColor,
                            contentColor = Color.White,
                        ),
                        shape = RoundedCornerShape(99.dp)

                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(Icons.Filled.ThumbUp, contentDescription = "ThumbUp")
                            Text(
                                screen,
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp,
                                )
                            )
                        }
                    }
                }

            }

        }
    }

}




