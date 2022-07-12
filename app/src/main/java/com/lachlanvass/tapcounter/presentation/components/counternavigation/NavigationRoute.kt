package com.lachlanvass.tapcounter.presentation.components.counternavigation

sealed class NavigationRoute(val routeName: String) {

    object OneCounter: NavigationRoute("One Counter")
    object TwoCounter: NavigationRoute("Two Counters")
}

