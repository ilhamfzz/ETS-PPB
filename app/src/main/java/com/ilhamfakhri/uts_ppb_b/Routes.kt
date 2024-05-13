package com.ilhamfakhri.uts_ppb_b

sealed class Routes(val route: String) {
    object Splash : Routes("splash")
    object Login : Routes("login")
    object Pin : Routes("pin")
    object Home : Routes("home")
}