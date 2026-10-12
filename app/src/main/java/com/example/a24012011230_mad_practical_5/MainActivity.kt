package com.example.a24012011230_mad_practical_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.a24012011230_mad_practical_5.ui.theme._24012011230_MAD_Practical5Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            _24012011230_MAD_Practical5Theme {
                AppNavigation(context = this)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppNavigationPreview() {
    _24012011230_MAD_Practical5Theme {
        // Preview placeholder
    }
}
