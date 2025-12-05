package com.trietng.txca.ui.control

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainControl(
    onNavigateToMonthly: () -> Unit,
    onNavigateToYearly: () -> Unit,
    onNavigateToCatalog: () -> Unit = {},
    onNavigateToSettings: () -> Unit = {},
    content: @Composable (() -> Unit)
) {
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Text("Expense", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleMedium)
                NavigationDrawerItem(
                    icon = {
                        Icon(Icons.Filled.DateRange, contentDescription = null)
                    },
                    label = {
                        Text(text = "Monthly")
                    },
                    selected = false,
                    onClick = onNavigateToMonthly
                )
                NavigationDrawerItem(
                    icon = {
                        Icon(Icons.Filled.DateRange, contentDescription = null)
                    },
                    label = {
                        Text(text = "Yearly")
                    },
                    selected = false,
                    onClick = onNavigateToYearly
                )
                HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                Text("Catalog", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleMedium)
            }
        }
    ) {
        content()
    }
}