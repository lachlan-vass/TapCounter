package com.lachlanvass.tapcounter.presentation.components.counternavigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lachlanvass.tapcounter.R

@Composable
fun CounterNavigation(

    navigationRoutes: List<NavigationRoute>
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
    
    navigationRoutes.forEach {
        Button(onClick = { /*TODO*/ }) {
            Text(text = it.routeName)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterNavigationPreview() {

//    CounterNavigation(listOf("One Counter", "Two Counters"))

}