package com.fisi.tallersw.g9.lms.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fisi.tallersw.g9.lms.navigation.AppScreens
import com.fisi.tallersw.g9.lms.ui.theme.LMSBlack20
import com.fisi.tallersw.g9.lms.ui.theme.LMSPrimary
import com.fisi.tallersw.g9.lms.ui.theme.LMSSurface
import com.fisi.tallersw.g9.lms.widgets.ui.CustomButton
import com.fisi.tallersw.g9.lms.widgets.ui.GoBack

@Composable
fun AuthSignInScreen(navController: NavController) {
    AuthSignIn(navController)
}

@Composable
fun AuthSignIn(navController: NavController) {
    var documentField by remember { mutableStateOf("") }
    var studentId by remember { mutableStateOf("") }
    var emailField by remember { mutableStateOf("") }
    var passwordField by remember { mutableStateOf("") }
    var termsField by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(16.dp))
                .background(
                    LMSSurface,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(20.dp)
        ) {
            GoBack(navController)
            Text(
                "Regístrate",
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold,
                color = LMSPrimary,
                modifier = Modifier.padding(bottom = 32.dp)
            )
            Column(
                modifier = Modifier
                    .border(
                        1.dp,
                        color = LMSBlack20,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(all = 16.dp)
            ) {
                OutlinedTextField(value = documentField,
                    onValueChange = { documentField = it },
                    label = { Text("DNI o CE") })
                Spacer(Modifier.height(16.dp))
                OutlinedTextField(
                    value = studentId,
                    onValueChange = { studentId = it },
                    label = { Text("Código UNMSM") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(Modifier.height(16.dp))
                OutlinedTextField(value = emailField,
                    onValueChange = { emailField = it },
                    label = { Text("Email UNMSM") })
                Spacer(Modifier.height(16.dp))
                OutlinedTextField(
                    value = passwordField,
                    onValueChange = { passwordField = it },
                    label = { Text("Contraseña") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )
            }
            Spacer(Modifier.height(20.dp))
            CustomButton(label = "Ingresar")
            Spacer(Modifier.height(20.dp))
            TextButton(onClick = {
                navController.navigate(route = AppScreens.AuthLoginScreen.route)
            }) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("¿Ya tienes una cuenta? ")
                    Text("Ingresa", color = LMSPrimary)
                }
            }
        }
    }
}
