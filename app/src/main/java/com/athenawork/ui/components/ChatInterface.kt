package com.athenawork.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ChatInterfaceSection() {
    Column {
        Text("Ask me to browse, research, or automate anything.")
        FlowRow {
            AssistChip(onClick = {}, label = { Text("Search Google") })
            AssistChip(onClick = {}, label = { Text("Compare products") })
            AssistChip(onClick = {}, label = { Text("Summarize page") })
            AssistChip(onClick = {}, label = { Text("Research topic") })
        }
        Row {
            TextButton(onClick = {}) { Text("/") }
            Text("Kimi 2.6")
        }
        Row {
            Text("ChatInputBar")
        }
    }
}
