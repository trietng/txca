package com.trietng.txca.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.trietng.txca.ui.control.MainControl
import com.trietng.txca.ui.screen.Monthly
import com.trietng.txca.ui.screen.MonthlyScreen
import com.trietng.txca.ui.screen.Yearly
import com.trietng.txca.ui.screen.YearlyScreen
import com.trietng.txca.ui.theme.TxcaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            TxcaTheme(
                dynamicColor = false
            ) {
                MainControl(
                    onNavigateToMonthly = {
                        navController.navigate(Monthly())
                    },
                    onNavigateToYearly = {
                        navController.navigate(Yearly())
                    }
                ) {
                    NavHost(navController, startDestination = Monthly()) {
                        composable<Monthly> { entry ->
                            val monthly = entry.toRoute<Monthly>()
                            MonthlyScreen(monthly.title)
                        }
                        composable<Yearly> { entry ->
                            val yearly = entry.toRoute<Yearly>()
                            YearlyScreen(yearly.title)
                        }
                    }
                }
            }
        }
    }
}