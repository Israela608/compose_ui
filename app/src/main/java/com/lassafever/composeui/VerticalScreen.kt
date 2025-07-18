package com.lassafever.composeui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
        TextComponent(
            "Hello there!",
            colorValue = Color.Black,
            size = 24.sp,
            fontWeightValue = FontWeight.Bold,
        )
        // TextComponent("Please Enter your name")
        Spacer(modifier = Modifier.padding(10.dp))
        TextFieldComponent()
        Spacer(modifier = Modifier.padding(40.dp))
        SimpleButton()
        Spacer(modifier = Modifier.padding(40.dp))
        ImageComponent()
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VerticalScreenPreview() {
    VerticalScreen()
}