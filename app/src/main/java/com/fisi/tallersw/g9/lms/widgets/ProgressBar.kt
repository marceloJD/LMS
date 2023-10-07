package com.fisi.tallersw.g9.lms.widgets

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fisi.tallersw.g9.lms.ui.theme.LMSPrimary
import com.fisi.tallersw.g9.lms.widgets.ui.CustomButton

@Composable
fun ProgressBar(progress: Float) {
    LinearProgressIndicator(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        // values: 0.0f - 1.0f
        progress = progress,
        color = LMSPrimary
    )
}

@Composable
fun ProgressBarDemo() {
    var progress by remember { mutableStateOf(0.5f) }

    Column(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        ProgressBar(progress)
        Spacer(modifier = Modifier.height(16.dp))
        CustomButton(label="Incrementar", onClick = {
            progress += 0.1f
            if (progress > 1.0f) {
                progress = 0.0f
            }
        })

    }
}

@Preview(showBackground = false, showSystemUi = false)
@Composable
fun Preview() {
    ProgressBarDemo()
}