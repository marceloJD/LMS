package com.fisi.tallersw.g9.lms.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fisi.tallersw.g9.lms.screens.SplashScreen
import com.fisi.tallersw.g9.lms.screens.auth.AuthLandingScreen
import com.fisi.tallersw.g9.lms.screens.auth.AuthLoginScreen
import com.fisi.tallersw.g9.lms.screens.auth.AuthSignInScreen
import com.fisi.tallersw.g9.lms.screens.dashboard.DashboardScreen

@Composable
fun AppNavigation() {
    val controller = rememberNavController()

    NavHost(
        navController = controller,
        // ! Splash debe iniciar aquí
        startDestination = AppScreens.SplashScreen.route
    ) {
        composable(route = AppScreens.SplashScreen.route) {
            SplashScreen(controller)
        }
        composable(route = AppScreens.AuthLandingScreen.route) {
            AuthLandingScreen(controller)
        }
        composable(route = AppScreens.AuthLoginScreen.route) {
            AuthLoginScreen(controller)
        }
        composable(route = AppScreens.AuthSignInScreen.route) {
            AuthSignInScreen(controller)
        }
        composable(route = AppScreens.DashboardScreen.route) {
            DashboardScreen(controller)
        }

//        composable(route = AppScreens.HomeScreen.route + "/{courseId}",
//            arguments = listOf(
//                navArgument(name = "courseId") {
//                    type = NavType.StringType
//                }
//            )) {
//            CourseDetailScreen(controller, it.arguments?.getString("courseId"))
//        }
    }
}