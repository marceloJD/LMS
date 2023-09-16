package com.fisi.tallersw.g9.lms.navigation

sealed class AppScreens(val route: String) {
    object SplashScreen : AppScreens(route = "splashScreen")
    object HomeScreen : AppScreens(route = "homeScreen")
}