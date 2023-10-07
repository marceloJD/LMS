package com.fisi.tallersw.g9.lms.widgets

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.fisi.tallersw.g9.lms.ui.theme.LMSPrimary
import com.fisi.tallersw.g9.lms.utils.getDaysUntil

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ProgressCard(classProgress:Float, nextClassDate: String){
    var progress by remember { mutableStateOf(classProgress) }

    Column {
        Row {
            Text(text = "Has completado un")
            Text(text = "56%", color = LMSPrimary)
            Text(text = "del curso")
        }
        ProgressBar(progress)
    }
    Row {
        Text(text = "Próxima clase:")
        Text(text = nextClassDate)
        Text(text = getDaysUntil(nextClassDate).toString())
    }
}

