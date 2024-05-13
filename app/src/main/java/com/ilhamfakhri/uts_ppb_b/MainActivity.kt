package com.ilhamfakhri.uts_ppb_b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ilhamfakhri.uts_ppb_b.screens.Home
import com.ilhamfakhri.uts_ppb_b.screens.Login
import com.ilhamfakhri.uts_ppb_b.screens.Pin
import com.ilhamfakhri.uts_ppb_b.screens.Splash

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenMain()
        }
    }
}


@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Splash.route) {

        //First route : SplashScreen
        composable(Routes.Splash.route) {
            Splash(navController = navController)
        }

        //Another Route : Login
        composable(Routes.Login.route) {
            //Login Screen
            Login(navController = navController)
        }

        composable(Routes.Pin.route) {
            //Pin Entry Screen
            Pin(navController = navController)
        }

        composable(Routes.Home.route) { navBackStack ->
            Home()
        }
    }
}