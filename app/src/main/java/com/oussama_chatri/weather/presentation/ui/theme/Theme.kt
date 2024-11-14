package com.oussama_chatri.weather.presentation.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext

val LocalPaddingSizes = staticCompositionLocalOf { PaddingSizes() }

val LocalCornerSizes = staticCompositionLocalOf { CornerSizes() }

val LocalIconSizes = staticCompositionLocalOf { IconSizes() }

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

    val paddingSizes = PaddingSizes()
    val cornerSizes = CornerSizes()
    val iconSizes = IconSizes()

    CompositionLocalProvider(
        LocalPaddingSizes provides remember { PaddingSizes() },
        LocalCornerSizes provides remember { CornerSizes() },
        LocalIconSizes provides remember { IconSizes() }
    ){
        MaterialTheme(
            colorScheme = colorScheme,
            typography = typography,
            content = content
        )
    }
}
