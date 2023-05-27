package com.redwaltz.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.redwaltz.calculatorapp.ui.theme.CalculatorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(R.layout.activity_main)
    }

    fun numberAction(view: View) {

    }
    fun operatorAction(view: View) {

    }
    fun allClearAction(view: View) {

    }
    fun backspaceAction(view: View) {

    }
    fun equateAction(view: View) {

    }
}
