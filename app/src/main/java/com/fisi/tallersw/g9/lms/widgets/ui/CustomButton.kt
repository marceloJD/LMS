package com.fisi.tallersw.g9.lms.widgets.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.fisi.tallersw.g9.lms.ui.theme.LMSBlack15
import com.fisi.tallersw.g9.lms.ui.theme.LMSPrimary

enum class ButtonVariant {
    PRIMARY,
    SECONDARY,
    TEXT
}

@Composable
fun CustomButton(
    label: String,
    onClick: () -> Unit = {},
    variant: ButtonVariant = ButtonVariant.PRIMARY,
) {
    Button(
        onClick,
        colors = ButtonColors(
            containerColor = LMSPrimary,
            contentColor = Color.White,
            disabledContainerColor = LMSBlack15,
            disabledContentColor = Color.White
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(label)
    }
}

@Preview
@Composable
fun CustomBottomPreview() {
    CustomButton("Hola")
}