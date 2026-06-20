package com.athenawork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.athenawork.ui.theme.AthenaTheme
import com.athenawork.ui.AthenaApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AthenaTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AthenaApp()
                }
            }
        }
    }
}
