package com.oussama_chatri.weather.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.oussama_chatri.weather.R

val poppinsFontFamily = FontFamily(
    Font(R.font.regular),
    Font(R.font.bold, weight = FontWeight.Bold),
    Font(R.font.medium, weight = FontWeight.Medium),
    Font(R.font.light, weight = FontWeight.Light)
)

val typography = Typography(
    displayLarge = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 57.sp,
        fontWeight = FontWeight.Bold
    ),
    displayMedium = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 45.sp,
        fontWeight = FontWeight.Bold
    ),
    displaySmall = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 36.sp,
        fontWeight = FontWeight.Bold
    ),
    headlineLarge = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    ),
    headlineMedium = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    ),
    headlineSmall = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    ),
    titleLarge = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    ),
    titleSmall = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    ),
    bodyLarge = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal
    ),
    bodyMedium = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    ),
    bodySmall = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    labelLarge = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    labelMedium = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    ),
    labelSmall = TextStyle(
        fontFamily = poppinsFontFamily,
        fontSize = 11.sp,
        fontWeight = FontWeight.Normal
    )
)
