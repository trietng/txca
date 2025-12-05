package com.trietng.txca.ui.screen

import androidx.compose.runtime.Composable
import com.trietng.txca.ui.layout.ExpenseLayout
import kotlinx.serialization.Serializable

@Serializable
data class Yearly(
    val title: String = "Yearly"
)

@Composable
fun YearlyScreen(
    title: String
) {
    ExpenseLayout(title) { }
}