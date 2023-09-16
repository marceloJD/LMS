package com.fisi.tallersw.g9.lms.widgets.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun GoBack(navController: NavController, text: String = "Volver") {
    Button(onClick = {
        navController.popBackStack()
    }) {
        Text(text)
    }
}