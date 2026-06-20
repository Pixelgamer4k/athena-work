package com.athenawork.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ControlButtonsSection() {
    Row(modifier = Modifier.fillMaxWidth()) {
        OutlinedButton(onClick = {}) { Text("Power") }
        Spacer(Modifier.weight(1f))
        OutlinedButton(onClick = {}) { Text("Reboot") }
        Spacer(Modifier.weight(1f))
        OutlinedButton(onClick = {}) { Text("Screenshot") }
    }
}
