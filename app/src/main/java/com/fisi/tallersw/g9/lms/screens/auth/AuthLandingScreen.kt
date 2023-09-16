package com.fisi.tallersw.g9.lms.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fisi.tallersw.g9.lms.R
import com.fisi.tallersw.g9.lms.navigation.AppScreens
import com.fisi.tallersw.g9.lms.ui.theme.LMSPrimary
import com.fisi.tallersw.g9.lms.widgets.ui.CustomButton

@Composable
fun AuthLandingScreen(navController: NavController) {
    AuthLanding(navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthLanding(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
            .padding(all = 16.dp)
            .padding(vertical = 64.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.lmsialogo),
                contentDescription = "Logo",
                modifier = Modifier.size(100.dp, 100.dp)
            )
            Column(
                modifier = Modifier.padding(top = 48.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Te damos la bienvenida,",
                    color = LMSPrimary, fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text("Inicia sesión para comenzar")
            }
        }
        Column {
            Text("Estudiante UNMSM,")
            CustomButton("Continuar", onClick = {
                navController.navigate(route = AppScreens.AuthLoginScreen.route)
            })
            TextButton(onClick = {
                navController.navigate(route = AppScreens.AuthSignInScreen.route)
            }) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("¿No tienes una cuenta? ")
                    Text("Unete", color = LMSPrimary)
                }
            }
        }
    }
}
