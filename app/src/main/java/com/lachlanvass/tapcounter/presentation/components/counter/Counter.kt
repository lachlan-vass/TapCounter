package com.lachlanvass.tapcounter.presentation.components.counter

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Counter() {

    var counterName by remember {
        mutableStateOf("")
    }

    var count by remember {
        mutableStateOf(0)
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(value = counterName, onValueChange = { counterName = it })

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            TextField(value = count.toString(), onValueChange = { count = it.toInt() })
        }

    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {

    Counter()
}
