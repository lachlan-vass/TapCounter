package com.lachlanvass.tapcounter.presentation.components.counternavigation

import android.content.Context
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lachlanvass.tapcounter.MainActivity
import com.lachlanvass.tapcounter.R
import com.lachlanvass.tapcounter.TwoCountersActivity

@Composable
fun CounterNavigation(
    context: Context
) {

    Card(
        elevation = 4.dp,
        border = BorderStroke(1.dp, color = Color.Gray),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            stringResource(R.string.counterNavigationTitle),
            style = TextStyle(
                fontWeight = FontWeight.Bold
            )
        )
    }

    Button(onClick = {

        context.startActivity(
            Intent(
                context, MainActivity::class.java
            ).addFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK
            )
        )

    }) {
        Text(text = NavigationRoute.OneCounter.routeName)
    }

    Button(onClick = {

        context.startActivity(
            Intent(
                context, TwoCountersActivity::class.java
            ).addFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK
            )
        )

    }) {
        Text(text = NavigationRoute.TwoCounter.routeName)
    }
}

@Preview(showBackground = true)
@Composable
fun CounterNavigationPreview() {

//    CounterNavigation(listOf("One Counter", "Two Counters"))

}