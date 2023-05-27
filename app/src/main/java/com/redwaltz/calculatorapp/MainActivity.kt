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

    private var canOperation = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(R.layout.activity_main)
    }

    fun numberAction(view: View) {
        if (view is Button) {
            workingTV.append(view.text)
        }
    }
    fun operatorAction(view: View) {
        if (view is Button && canOperation) {
            workingTV.append(view.text)
        }
    }
    fun allClearAction(view: View) {
        workingTV.text = ""
        resultTV.text = ""
    }
    fun backspaceAction(view: View) {
        val length = workingTV.length()
        if (length > 0)
            workingTV.text = workingTV.length.subSequence(0, length - 1)
    }
    fun equateAction(view: View) {

    }
}
