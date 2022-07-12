package com.lachlanvass.tapcounter.presentation.components.counterscreen

import android.content.Context
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lachlanvass.tapcounter.MainActivity
import com.lachlanvass.tapcounter.presentation.components.counter.Counter
import com.lachlanvass.tapcounter.presentation.components.counternavigation.CounterNavigation
import com.lachlanvass.tapcounter.presentation.components.counternavigation.NavigationRoute

@Composable
fun CounterScreen(
    numberOfOnScreenCounters: Int,
    context: Context
) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        Scaffold(
            drawerContent = {
                CounterNavigation(context)
            }
        ) {

        }

        Column() {

            repeat(numberOfOnScreenCounters) {
                Counter()
            }

        }

    }

}