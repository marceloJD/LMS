package com.fisi.tallersw.g9.lms.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fisi.tallersw.g9.lms.ui.theme.LMSGreenLight
import com.fisi.tallersw.g9.lms.ui.theme.LMSPrimary
import com.fisi.tallersw.g9.lms.ui.theme.LMSPrimaryLight
import com.fisi.tallersw.g9.lms.ui.theme.LMSSecondary
import com.fisi.tallersw.g9.lms.ui.theme.LMSSecondaryLight
import com.fisi.tallersw.g9.lms.widgets.UserBadge
import com.fisi.tallersw.g9.lms.widgets.ui.IconCard

@Composable
fun DashboardScreen(navController: NavController) {
    Dashboard(navController)
}

@Composable
fun Dashboard(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(LMSSecondary)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = "Buen día,", fontSize = 20.sp)
                Text(
                    text = "John Doe", fontSize = 24.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.White
                )
            }
            UserBadge()
        }
        Column {
            Row {
                IconCard(
                    label = "Mis cursos",
                    backgroundColor = LMSPrimaryLight,
                    icon = {},
                    onClick = {
                    }
                )
                Spacer(Modifier.width(24.dp))
                IconCard(
                    label = "Mi horario",
                    backgroundColor = LMSSecondaryLight,
                    icon = {}
                )
            }
            Spacer(Modifier.height(24.dp))
            Row {
                IconCard(
                    label = "Mis tareas",
                    backgroundColor = LMSGreenLight,
                    icon = {}
                )
            }
            Spacer(Modifier.height(24.dp))
            IconCard(label = "Mis preguntas",
                backgroundColor = LMSPrimary, icon = {})
        }
    }
}

@Preview()
@Composable
fun DashboardPreview() {

}