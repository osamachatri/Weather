package com.oussama_chatri.weather.presentation.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.oussama_chatri.weather.MainApp

val context = MainApp.applicationContext()

val LocalPaddingSizes = staticCompositionLocalOf { getPaddingSizes(screenSizeCase = getScreenDpi(context)) }

val LocalCornerSizes = staticCompositionLocalOf { getCornerSizes(screenSizeCase = getScreenDpi(context)) }

val LocalIconSizes = staticCompositionLocalOf { getIconSizes(screenSizeCase = getScreenDpi(context)) }

data class DesignMetrics(
    val paddingSizes: PaddingSizes,
    val cornerSizes: CornerSizes,
    val iconSizes: IconSizes
)

val MaterialTheme.localPaddingSizes: PaddingSizes
    @Composable
    @ReadOnlyComposable
    get() = LocalPaddingSizes.current

val MaterialTheme.localCornerSizes: CornerSizes
    @Composable
    @ReadOnlyComposable
    get() = LocalCornerSizes.current

val MaterialTheme.localIconSizes: IconSizes
    @Composable
    @ReadOnlyComposable
    get() = LocalIconSizes.current

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

@Composable
fun WeatherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val screenSizeCase = getScreenSizeCase()
    val typography = getTypographyByScreenSize(screenSizeCase)

    val paddingSizes = getPaddingSizes(screenSizeCase = screenSizeCase)
    val cornerSizes = getCornerSizes(screenSizeCase = screenSizeCase)
    val iconSizes = getIconSizes(screenSizeCase = screenSizeCase)

    CompositionLocalProvider(
        LocalPaddingSizes provides remember { paddingSizes },
        LocalCornerSizes provides remember { cornerSizes },
        LocalIconSizes provides remember { iconSizes }
    ){
        MaterialTheme(
            colorScheme = colorScheme,
            typography = typography,
            content = content
        )
    }
}
