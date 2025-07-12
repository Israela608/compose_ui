package com.lassafever.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalScreen() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.Black),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent("Text 1")
        TextComponent("Text 2")
        TextComponent("Text 3")
        TextComponent("Text 4")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HorizontalScreenPreview() {
    HorizontalScreen()
}