package com.lassafever.composeui

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
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
        // colorValue = Color.Magenta,
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
    size: TextUnit = 18.sp,
    colorValue: Color = Color.Magenta,
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
            //.wrapContentWidth()
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

@Composable
fun SimpleButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxWidth()
            .height(68.dp),
        onClick = {
            Log.d("SimpleButton", "Button Clicked!")
        },
        shape = RoundedCornerShape(12.dp)
    ) {
        NormalText("Click here", TextAlign.Center)
    }
}

@Preview
@Composable
fun SimpleButtonPreview() {
    SimpleButton()

}

@Composable
fun NormalText(value: String, alignment: TextAlign = TextAlign.Start) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        text = value,
        textAlign = alignment,
        fontSize = 16.sp
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent() {
//    var text = ""
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        textStyle = TextStyle(
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Blue
        ),
        label = {
            NormalText("Your name")
        },
        placeholder = {
            NormalText("Please Enter your name")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
    )
}

@Preview
@Composable
fun TextFieldComponentPreview() {
    TextFieldComponent()
}

@Composable
fun ImageComponent() {
    Image(
        modifier = Modifier
            .size(308.dp)
            .clip(CircleShape),
//            .wrapContentHeight()
//            .fillMaxWidth(),
        //.background(Color.Black),
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Channel Logo",
        contentScale = ContentScale.Crop,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageComponentPreview() {
    ImageComponent()
}

@Composable
fun MixLists() {
    Column(
        modifier = Modifier.background(Color.LightGray)
    ) {
        HorizontalListExample()
        Spacer(modifier = Modifier.height(20.dp))
        ListExample()
    }
}