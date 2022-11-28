package com.ogtulashvili.newwordforanki.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Immutable
data class AppColors(
    val primary: Color,
    val primaryVariant: Color,
    val secondary: Color,
    val background: Color,
    val secondaryBackground: Color,
    val dividers: Color,
    val content: Color,
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        primaryVariant = Color.Unspecified,
        secondary = Color.Unspecified,
        background = Color.Unspecified,
        secondaryBackground = Color.Unspecified,
        dividers = Color.Unspecified,
        content = Color.Unspecified,
    )
}
val LocalAppTypography = staticCompositionLocalOf {
    AppTypography()
}
val LocalAppElevation = staticCompositionLocalOf {
    AppElevation(
        default = 4.dp,
        pressed = 8.dp
    )
}
val LocalAppShape = staticCompositionLocalOf {
    AppShape(
        standart = 12.dp
    )
}

private val DarkColorPalette = AppColors(
    primary = Color(0xFF009BFF),
    primaryVariant = Color(0xFFFFFFFF),
    secondary = Color.Black.copy(alpha = 0.4f),
    background = Color.White,
    secondaryBackground = Color(0xFFF7F7F7),
    dividers = Color(0xFFE6E6E6),
    content = Color.Black,
)
private val LightColorPalette = AppColors(
    primary = Color(0xFF009BFF),
    primaryVariant = Color(0xFFFFFFFF),
    secondary = Color.Black.copy(alpha = 0.4f),
    background = Color.White,
    secondaryBackground = Color(0xFFF7F7F7),
    dividers = Color(0xFFE6E6E6),
    content = Color.Black,
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val appColors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
}

object AppTheme {
    val color: AppColors
        @Composable
        get() = LocalAppColors.current
    val typography: AppTypography
        @Composable
        get() = LocalAppTypography.current
    val elevation: AppElevation
        @Composable
        get() = LocalAppElevation.current
    val shape: AppShape
        @Composable
        get() = LocalAppShape.current
}

