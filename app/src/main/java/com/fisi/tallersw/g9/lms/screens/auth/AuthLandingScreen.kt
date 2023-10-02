package com.fisi.tallersw.g9.lms.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fisi.tallersw.g9.lms.R
import com.fisi.tallersw.g9.lms.iabutton.Iabutton
import com.fisi.tallersw.g9.lms.menuoptionrow.MenuOptionRow
import com.fisi.tallersw.g9.lms.menuoptionrow.Type
import com.fisi.tallersw.g9.lms.navigation.AppScreens
import com.fisi.tallersw.g9.lms.numberindicator.NumberIndicator
import com.fisi.tallersw.g9.lms.numberindicator.Status
import com.fisi.tallersw.g9.lms.profileheader.ProfileHeader
import com.fisi.tallersw.g9.lms.ui.theme.LMSBLack50
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


@Composable
@Preview
fun RelayComponentsPreview (){
    Column(modifier=Modifier.padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        ProfileHeader(
            name = "Lorem Ipsum",
            lastName = "Et Amet",
            facultyName = "FISI",
            schoolName = "Ing. Software",
            profileImage = painterResource(id = R.drawable.lmsialogo)
        )
        Spacer(modifier = Modifier.height(64.dp))
        // TODO: Add separators (either inside Relaycomponent or using separator)
        Column(modifier= Modifier
            .clip(shape = RoundedCornerShape(12.dp))
            .background(Color.White)) {
            MenuOptionRow(
                type = Type.MenuHeader,
                optionHeader = "Perfil personal"
            )
            MenuOptionRow(
                type = Type.Label,
                optionTitle = "ID universitario"
            )
            MenuOptionRow(
                type = Type.Label,
                optionTitle = "Actualizar datos"
            )
            MenuOptionRow(
                type = Type.Label,
                optionTitle = "Preguntas frecuentes"
            )
        }
        Spacer(modifier = Modifier.height(64.dp))
        // TODO: Encontrar modo de aplicar gradiente (Relay no soporta)
        Iabutton(modifier=Modifier.clip(shape = CircleShape))
        Spacer(modifier = Modifier.height(64.dp))
        NumberIndicator(status = Status.Fail, numberValue = "0", numberCap = "/20")
        NumberIndicator(status = Status.Approved, numberValue = "20", numberCap = "/20")
    }
}