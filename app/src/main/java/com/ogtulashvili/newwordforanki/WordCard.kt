package com.ogtulashvili.newwordforanki

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.ogtulashvili.newwordforanki.domain.GetRandomWord
import com.ogtulashvili.newwordforanki.presentation.Buttons

@Composable
fun WordCard() {
    Column {
        GetRandomWord()
        GetDefinitionToRandomWord()
        Buttons()
    }
}