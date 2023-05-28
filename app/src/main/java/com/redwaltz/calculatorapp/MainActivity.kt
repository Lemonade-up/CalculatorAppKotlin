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

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.clearButton.setOnClickListener{
            binding.inputTV.text = ""
            binding.outputTV.text = ""
        }
        binding.backButton.setOnClickListener{
            val length = binding.inputTV.length()
            if (length > 0)
                binding.inputTV.text = binding.inputTV.text.subSequence(0, length-1)
        }

    }



}
