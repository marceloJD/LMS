package com.fisi.tallersw.g9.lms.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fisi.tallersw.g9.lms.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

// LMS custom typography rules
val TextStyle1 = TextStyle(
    fontSize = 24.sp,
    fontFamily = FontFamily(Font(R.font.outfit_semibold)),
    fontWeight = FontWeight(600),
    color = LMSBlack
)

val TextStyle1_XLarge = TextStyle(
    fontSize = 48.sp,
    fontFamily = FontFamily(Font(R.font.outfit_semibold)),
    fontWeight = FontWeight(600),
)

val TextStyle2 = TextStyle(
    fontSize = 20.sp,
    fontFamily = FontFamily(Font(R.font.outfit_medium)),
    fontWeight = FontWeight(500),
)

val TextStyle2_Small = TextStyle(
    fontSize = 12.sp,
    fontFamily = FontFamily(Font(R.font.outfit_medium)),
    fontWeight = FontWeight(500),
)

val TextStyle3 = TextStyle(
    fontSize = 16.sp,
    fontFamily = FontFamily(Font(R.font.outfit_regular)),
    fontWeight = FontWeight(400),
)

val TextStyle3_Small = TextStyle(
    fontSize = 12.sp,
    fontFamily = FontFamily(Font(R.font.outfit_regular)),
    fontWeight = FontWeight(400),
)

val TextStyle4 = TextStyle(
    fontSize = 12.sp,
    fontFamily = FontFamily(Font(R.font.outfit_light)),
    fontWeight = FontWeight(300),
)

