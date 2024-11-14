package com.oussama_chatri.weather.presentation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Dp

data class PaddingSizes(
    val small: Dp,
    val medium: Dp,
    val large: Dp
)

fun getPaddingSizes(screenSizeCase: ScreenSizeCase): PaddingSizes {
    return when (screenSizeCase) {
        ScreenSizeCase.Small -> PaddingSizes(small = 4.dp, medium = 8.dp, large = 12.dp)
        ScreenSizeCase.Medium -> PaddingSizes(small = 8.dp, medium = 16.dp, large = 24.dp)
        ScreenSizeCase.Large -> PaddingSizes(small = 12.dp, medium = 20.dp, large = 32.dp)
        ScreenSizeCase.ExtraLarge -> PaddingSizes(small = 16.dp, medium = 24.dp, large = 40.dp)
    }
}

data class CornerSizes(
    val small: Dp,
    val medium: Dp,
    val large: Dp
)

fun getCornerSizes(screenSizeCase: ScreenSizeCase): CornerSizes {
    return when (screenSizeCase) {
        ScreenSizeCase.Small -> CornerSizes(small = 2.dp, medium = 4.dp, large = 8.dp)
        ScreenSizeCase.Medium -> CornerSizes(small = 4.dp, medium = 8.dp, large = 16.dp)
        ScreenSizeCase.Large -> CornerSizes(small = 6.dp, medium = 12.dp, large = 20.dp)
        ScreenSizeCase.ExtraLarge -> CornerSizes(small = 8.dp, medium = 16.dp, large = 24.dp)
    }
}

data class IconSizes(
    val small: Dp,
    val medium: Dp,
    val large: Dp
)

    fun getIconSizes(screenSizeCase: ScreenSizeCase): IconSizes {
    return when (screenSizeCase) {
        ScreenSizeCase.Small -> IconSizes(small = 16.dp, medium = 24.dp, large = 32.dp)
        ScreenSizeCase.Medium -> IconSizes(small = 24.dp, medium = 36.dp, large = 48.dp)
        ScreenSizeCase.Large -> IconSizes(small = 32.dp, medium = 48.dp, large = 64.dp)
        ScreenSizeCase.ExtraLarge -> IconSizes(small = 40.dp, medium = 56.dp, large = 72.dp)
    }
}