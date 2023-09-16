package com.fisi.tallersw.g9.lms.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fisi.tallersw.g9.lms.ui.theme.LMSSurface

@Composable
fun UserBadge() {
    Box(
        modifier = Modifier
            .width(32.dp)
            .height(32.dp)
            .background(
                color = LMSSurface, shape = RoundedCornerShape(32.dp)
            )
    )
}