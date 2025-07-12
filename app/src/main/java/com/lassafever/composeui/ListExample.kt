package com.lassafever.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListExample() {

    val someValues = listOf(
        "Egusi Soup",
        "Spaghetti",
        "Fried Chicken",
        "Panarottis Pizza",
        "Suya",
        "Jollof Rice",
        "Fried Rice",
        "Baked Beans",
        "Potatoe and Egg",
        "Amala and Ewedu",
        "Indomie and egg",
        "Meat Pie",
        "Sausage",
        "Burger and Coke",
        "Egusi Soup",
        "Spaghetti",
        "Fried Chicken",
        "Panarottis Pizza",
        "Suya",
        "Jollof Rice",
        "Fried Rice",
        "Baked Beans",
        "Potatoe and Egg",
        "Amala and Ewedu",
        "Indomie and egg",
        "Meat Pie",
        "Sausage",
        "Burger and Coke",
        "Egusi Soup",
        "Spaghetti",
        "Fried Chicken",
        "Panarottis Pizza",
        "Suya",
        "Jollof Rice",
        "Fried Rice",
        "Baked Beans",
        "Potatoe and Egg",
        "Amala and Ewedu",
        "Indomie and egg",
        "Meat Pie",
        "Sausage",
        "Burger and Coke",
    )

    LazyColumn {
        items(someValues) { item: String ->
            TextComponent(value = item)
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.Black)
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListExamplePreview() {
    ListExample()
}