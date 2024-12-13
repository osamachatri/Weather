package com.oussama_chatri.weather.presentation.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext

val LocalPadding = staticCompositionLocalOf { PaddingSizes() }
val LocalIcons = staticCompositionLocalOf { IconSizes() }
val LocalImages = staticCompositionLocalOf { ImageSizes() }
val LocalCorners = staticCompositionLocalOf { CornerSizes() }

object AppPadding {
    val sizes: PaddingSizes
        @Composable
        get() = LocalPadding.current
}

object AppIcons {
    val sizes: IconSizes
        @Composable
        get() = LocalIcons.current
}

object AppImages {
    val sizes: ImageSizes
        @Composable
        get() = LocalImages.current
}

object AppCorners {
    val sizes: CornerSizes
        @Composable
        get() = LocalCorners.current
}


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun WeatherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    paddingSizes: PaddingSizes = PaddingSizes(),
    iconSizes: IconSizes = IconSizes(),
    imageSizes: ImageSizes = ImageSizes(),
    cornerSizes: CornerSizes = CornerSizes(),
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

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography
    ) {
        CompositionLocalProvider(
            LocalPadding provides paddingSizes,
            LocalIcons provides iconSizes,
            LocalImages provides imageSizes,
            LocalCorners provides cornerSizes
        ) {
            content()
        }
    }
}