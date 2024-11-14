package com.oussama_chatri.weather.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.oussama_chatri.weather.R

object Fonts {

    val Poppins = FontFamily(
        Font(R.font.regular, FontWeight.Normal),
        Font(R.font.medium, FontWeight.Medium),
        Font(R.font.semi_bold, FontWeight.SemiBold),
        Font(R.font.bold, FontWeight.Bold),
        Font(R.font.extra_bold, FontWeight.ExtraBold),
        Font(R.font.light, FontWeight.Light)
    )
}

@Composable
fun getTypographyByScreenSize(screenSizeCase: ScreenSizeCase): Typography {
    return when (screenSizeCase) {
        ScreenSizeCase.Small -> Typography(
            displayLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 32.sp),
            displayMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 30.sp),
            displaySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 28.sp),
            headlineLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 24.sp),
            headlineMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 20.sp),
            headlineSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 18.sp),
            titleLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 20.sp),
            titleMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 18.sp),
            titleSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 16.sp),
            bodyLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 16.sp),
            bodyMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 14.sp),
            bodySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 12.sp),
            labelLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 14.sp),
            labelMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 12.sp),
            labelSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 10.sp)
        )
        ScreenSizeCase.Medium -> Typography(
            displayLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 40.sp),
            displayMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 36.sp),
            displaySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 34.sp),
            headlineLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 30.sp),
            headlineMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 26.sp),
            headlineSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 24.sp),
            titleLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 24.sp),
            titleMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 22.sp),
            titleSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 18.sp),
            bodyLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 18.sp),
            bodyMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 16.sp),
            bodySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 14.sp),
            labelLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 16.sp),
            labelMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 14.sp),
            labelSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 12.sp)
        )
        ScreenSizeCase.Large -> Typography(
            displayLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 50.sp),
            displayMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 44.sp),
            displaySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 40.sp),
            headlineLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 36.sp),
            headlineMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 32.sp),
            headlineSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 28.sp),
            titleLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 28.sp),
            titleMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 26.sp),
            titleSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 22.sp),
            bodyLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 22.sp),
            bodyMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 20.sp),
            bodySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 18.sp),
            labelLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 18.sp),
            labelMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 16.sp),
            labelSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 14.sp)
        )
        ScreenSizeCase.ExtraLarge -> Typography(
            displayLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 60.sp),
            displayMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 54.sp),
            displaySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Bold, fontSize = 48.sp),
            headlineLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 42.sp),
            headlineMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 38.sp),
            headlineSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.SemiBold, fontSize = 34.sp),
            titleLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 34.sp),
            titleMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 30.sp),
            titleSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Medium, fontSize = 26.sp),
            bodyLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 26.sp),
            bodyMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 24.sp),
            bodySmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Normal, fontSize = 22.sp),
            labelLarge = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 20.sp),
            labelMedium = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 18.sp),
            labelSmall = TextStyle(fontFamily = Fonts.Poppins, fontWeight = FontWeight.Light, fontSize = 16.sp)
        )
    }
}