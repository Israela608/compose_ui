package com.lassafever.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VerticalScreen() {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            //.background(Color.Black)
            .fillMaxWidth()
            .padding(18.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        TextComponent("Text 1")
        TextComponent("Text 2")
        TextComponent("Text 3")
        TextComponent("Text 4")
        SimpleButton()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VerticalScreenPreview() {
    VerticalScreen()
}