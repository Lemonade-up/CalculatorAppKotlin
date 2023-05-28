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
import com.redwaltz.calculatorapp.databinding.ActivityMainBinding
import com.redwaltz.calculatorapp.ui.theme.CalculatorAppTheme

class MainActivity : ComponentActivity() {

    private var canAddOperation = false
    private var canAddDecimal = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)
    }

    fun numberAction(view: View) {
        if (view is Button) {
            if (view.text == "" ) {
                if (canAddDecimal)
                    workingTV.append(view.text)
                canAddDecimal = false

            }
            else
                workingTV.append(view.text)
            canAddOperation = true
        }
    }
    fun operatorAction(view: View) {
        if (view is Button && canAddOperation) {
            workingTV.append(view.text)
            canAddOperation = false
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
