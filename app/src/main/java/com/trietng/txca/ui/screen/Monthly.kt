package com.trietng.txca.ui.screen

import androidx.compose.runtime.Composable
import com.trietng.txca.ui.layout.ExpenseLayout
import kotlinx.serialization.Serializable

@Serializable
data class Monthly(
    val title: String = "Monthly"
)

@Composable
fun MonthlyScreen(
    title: String
) {
    ExpenseLayout(title) {

    }
}