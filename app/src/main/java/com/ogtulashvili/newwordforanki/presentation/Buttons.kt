package com.ogtulashvili.newwordforanki.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import com.ogtulashvili.newwordforanki.PrimaryButton
import java.lang.reflect.Modifier

@Composable
fun Buttons() {
    Row {
        PrimaryButton(text = "Add to Anki")
        PrimaryButton(text = "Next Word")
    }
}