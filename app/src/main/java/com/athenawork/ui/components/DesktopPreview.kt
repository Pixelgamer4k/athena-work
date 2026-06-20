package com.athenawork.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp

@Composable
fun DesktopPreviewSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(16f / 10f)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF1a1a2e), Color(0xFF0f0c29))
                ),
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Column {
            Row {
                Text("Activities")
                Spacer(modifier = Modifier.weight(1f))
                Text("12:00")
            }
            Row(modifier = Modifier.weight(1f)) {
                Column {
                    Text("Home")
                    Text("Docs")
                    Text("Term")
                }
                Box(modifier = Modifier.weight(1f)) {
                    Text("File Manager")
                }
            }
            Row {
                Text("Taskbar")
            }
        }
    }
}
