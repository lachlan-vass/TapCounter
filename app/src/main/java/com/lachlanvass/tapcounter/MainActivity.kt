package com.lachlanvass.tapcounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.lachlanvass.tapcounter.presentation.components.counter.Counter
import com.lachlanvass.tapcounter.presentation.components.counternavigation.CounterNavigation
import com.lachlanvass.tapcounter.presentation.components.counternavigation.NavigationRoute
import com.lachlanvass.tapcounter.ui.theme.TapCounterTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadCounterUi(numberOfCounters = 2)
    }

    private fun loadCounterUi(numberOfCounters: Int) {

        setContent {
            TapCounterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Scaffold(

                        drawerContent = {
                            CounterNavigation(listOf(
                                NavigationRoute.OneCounter,
                                NavigationRoute.TwoCounter
                            ))
                        }
                    ) {

                    }

                    Column() {

                        repeat(numberOfCounters) {
                            Counter()
                        }

                    }

                }
            }
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    TapCounterTheme {
//        Greeting("Android")
//    }
//}