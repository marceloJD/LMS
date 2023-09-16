package com.fisi.tallersw.g9.lms.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.fisi.tallersw.g9.lms.screens.CourseDetailScreen
import com.fisi.tallersw.g9.lms.screens.HomeScreen
import com.fisi.tallersw.g9.lms.screens.SplashScreen

@Composable
fun AppNavigation() {
    val controller = rememberNavController();

    NavHost(navController = controller, startDestination = AppScreens.SplashScreen.route) {
        composable(route = AppScreens.SplashScreen.route) {
            SplashScreen(controller)
        }
        composable(route = AppScreens.HomeScreen.route) {
            HomeScreen(controller)
        }
        composable(route = AppScreens.HomeScreen.route + "/{courseId}",
            arguments = listOf(
                navArgument(name = "courseId") {
                    type = NavType.StringType
                }
            )) {
            CourseDetailScreen(controller, it.arguments?.getString("courseId"))
        }
    }
}