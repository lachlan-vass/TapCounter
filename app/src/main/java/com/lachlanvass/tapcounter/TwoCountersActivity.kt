package com.lachlanvass.tapcounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lachlanvass.tapcounter.presentation.components.counterscreen.CounterScreen
import com.lachlanvass.tapcounter.ui.theme.TapCounterTheme

class TwoCountersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TapCounterTheme {

                CounterScreen(numberOfOnScreenCounters = 2, this.applicationContext)

            }
        }
    }
}