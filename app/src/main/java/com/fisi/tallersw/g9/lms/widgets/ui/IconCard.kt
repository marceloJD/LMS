package com.fisi.tallersw.g9.lms.widgets.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fisi.tallersw.g9.lms.R
import com.fisi.tallersw.g9.lms.ui.theme.LMSBlack
import com.fisi.tallersw.g9.lms.ui.theme.LMSSecondary
import com.fisi.tallersw.g9.lms.ui.theme.LMSSurface

@Composable
fun IconCard(
    backgroundColor: Color = LMSSurface,
    label: String,
    labelColor: Color = LMSSurface,
    icon: @Composable() () -> Unit={
        Image(
            painter = painterResource(id = R.drawable.back_arrow_black),
            contentDescription = "iconCardName",
        )
    },
    onClick: () -> Unit = {},
    modifier:Modifier=Modifier
) {
    Column(
        modifier = modifier
            .shadow(
                elevation = 8.dp,
                spotColor = Color(0x26000000),
                ambientColor = Color(0x26000000)
            )
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(size = 16.dp)
            )
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(size = 16.dp)
            )
            .clickable { onClick() }
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        icon()
        Spacer(modifier = Modifier.height(96.dp))
        Text(
            label, fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = labelColor
        )
    }
}

@Preview
@Composable
fun IconCardPreview() {
    val iconCardName = "Mis cursos"
    IconCard(
        backgroundColor = LMSSecondary,
        icon = {
            Image(
                painter = painterResource(id = R.drawable.back_arrow_black),
                contentDescription = iconCardName,
            )
        },
        label = iconCardName,
    )
}