package com.athenawork.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.athenawork.ui.components.DesktopPreviewSection
import com.athenawork.ui.components.ControlButtonsSection
import com.athenawork.ui.components.ChatInterfaceSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AthenaChatScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Athena") },
                navigationIcon = { 
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, contentDescription = "Menu")
                    }
                },
                actions = { Text("ONLINE") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
        ) {
            DesktopPreviewSection()
            ControlButtonsSection()
            ChatInterfaceSection()
        }
    }
}
