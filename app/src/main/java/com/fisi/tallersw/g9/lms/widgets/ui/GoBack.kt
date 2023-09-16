package com.fisi.tallersw.g9.lms.widgets.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.fisi.tallersw.g9.lms.R

@Composable
fun GoBack(navController: NavController, text: String = "Atrás") {
    TextButton(onClick = {
        navController.popBackStack()
    }) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.back_arrow_black),
                contentDescription = "back arrow",
                )
            Text(text, modifier = Modifier.padding(start = 8.dp))
        }
    }
}