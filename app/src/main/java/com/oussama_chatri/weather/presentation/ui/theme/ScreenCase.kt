package com.oussama_chatri.weather.presentation.ui.theme

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

enum class ScreenSizeCase {
    Small, Medium, Large, ExtraLarge
}

@Composable
fun getScreenSizeCase(): ScreenSizeCase {
    val context = LocalContext.current
    val metrics = context.resources.displayMetrics
    val densityDpi = metrics.densityDpi

    return when {
        densityDpi <= 320 -> ScreenSizeCase.Small
        densityDpi in 321..480 -> ScreenSizeCase.Medium
        densityDpi in 481..640 -> ScreenSizeCase.Large
        else -> ScreenSizeCase.ExtraLarge
    }
}

fun getScreenDpi(
    context: Context
): ScreenSizeCase {

    val metrics = context.resources.displayMetrics
    val densityDpi = metrics.densityDpi

    return when {
        densityDpi < 320 -> ScreenSizeCase.Small
        densityDpi in 320..480 -> ScreenSizeCase.Medium
        densityDpi in 481..640 -> ScreenSizeCase.Large
        else -> ScreenSizeCase.ExtraLarge
    }
}