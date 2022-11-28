package com.ogtulashvili.newwordforanki

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import com.ogtulashvili.newwordforanki.presentation.Buttons
import java.lang.reflect.Modifier

@Composable
fun WordCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        GetRandomWord()
        GetDefinitionToRandomWord()
        Buttons()
    }
}