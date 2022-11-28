package com.ogtulashvili.newwordforanki.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.ogtulashvili.newwordforanki.ui.theme.AppTheme

@Composable
fun ViewWord (
    text: String
) {
    Text(
        text = text,
        style = AppTheme.typography.h1,
        textAlign = TextAlign.Center,
        color = AppTheme.color.content
    )
}