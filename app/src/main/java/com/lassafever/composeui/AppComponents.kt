package com.lassafever.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HelloWorld(name: String) {
    TextComponent(
        value = "Hello $name",
        size = 36.sp,
        colorValue = Color.Magenta,
        maxLinesValue = 4
    )
}


/*@Preview(showBackground = true)
@Composable
fun HelloWorldPreviewForComponent(nameValue: String = "Israel") {
    HelloWorld(nameValue)
}*/

// show background shows the white background
// show system ui shows the look on an actual device
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloWorldPreviewInMobileScreen(nameValue: String = "Israel") {
    HelloWorld(nameValue)
}

@Composable
fun TextComponent(
    value: String,
    size: TextUnit,
    colorValue: Color,
    fontWeightValue: FontWeight = FontWeight.Normal,
    fontStyleValue: FontStyle = FontStyle.Normal,
    maxLinesValue: Int? = null,
    backgroundColor: Color = Color.White
) {
    Text(
        // Modifiers respect the elements in order
        modifier = Modifier
            //.fillMaxSize()
            .fillMaxWidth()
            //.wrapContentWidth(align = Alignment.Start)
            .wrapContentHeight(align = Alignment.Top)
            //.clip(shape = RoundedCornerShape(20.dp))
            .background(backgroundColor)
            //.border(width = 2.dp, color = Color.Magenta, shape = RoundedCornerShape(20.dp))
            .padding(18.dp),
        //.alpha(0.5f),
        text = value,
        fontSize = size,
        color = colorValue,
        fontWeight = fontWeightValue,
        fontStyle = fontStyleValue,
        maxLines = maxLinesValue ?: Int.MAX_VALUE,
        overflow = TextOverflow.Ellipsis,
    )
}

