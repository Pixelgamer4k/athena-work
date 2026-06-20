package com.athenawork.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.athenawork.ui.screens.AthenaChatScreen
import com.athenawork.ui.screens.SettingsScreen

@Composable
fun AthenaApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "chat") {
        composable("chat") { AthenaChatScreen() }
        composable("settings") { SettingsScreen() }
    }
}
