package com.lachlanvass.tapcounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import com.lachlanvass.tapcounter.presentation.components.counternavigation.NavigationRoute
import com.lachlanvass.tapcounter.presentation.components.counterscreen.CounterScreen
import com.lachlanvass.tapcounter.ui.theme.TapCounterTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TapCounterTheme {
                CounterScreen(numberOfOnScreenCounters = 1, this.applicationContext)

            }
        }

    }
}

