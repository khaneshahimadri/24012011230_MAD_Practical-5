package com.example.a24012011230_mad_practical_5

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun CheckboxDemo(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Checkbox Demo")

        var redState by remember { mutableStateOf(true) }
        Row(
            modifier= Modifier){
            var verticalAlignment = Alignment.CenterVertically
        }
        Checkbox(
            checked = redState,
            onCheckedChange = {
                redState = it
            }
        )

        var blueState by remember { mutableStateOf(true) }
        Row(
            modifier= Modifier){
            var verticalAlignment = Alignment.CenterVertically
        }
        Checkbox(
            checked = blueState,
            onCheckedChange = {
                blueState = it
            }
        )

        var greenState by remember { mutableStateOf(true) }
        Row(
            modifier= Modifier){
            var verticalAlignment = Alignment.CenterVertically
        }
        Checkbox(
            checked = greenState,
            onCheckedChange = {
                greenState = it
            }
        )
    }
}
