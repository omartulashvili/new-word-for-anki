package com.ogtulashvili.newwordforanki

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ogtulashvili.newwordforanki.ui.theme.AppTheme

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    enabled: Boolean = true
) {
    Row {
        Text(
            modifier = Modifier
                .clip(RoundedCornerShape(AppTheme.shape.standart))
                .background(AppTheme.color.primary)
                .padding(12.dp),
            text = text,
            style = AppTheme.typography.body2,
            textAlign = TextAlign.Center,
            color = AppTheme.color.primaryVariant
        )
    }
}