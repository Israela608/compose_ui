package com.lassafever.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Column {
                // VerticalScreen()
                HorizontalScreen()
                MixLists()

            }
            // HelloWorld("Balablue")
        }
    }
}
