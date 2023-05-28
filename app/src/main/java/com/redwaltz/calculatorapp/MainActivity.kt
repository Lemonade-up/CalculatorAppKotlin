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
        binding.button0.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"0")
        }
        binding.button1.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"1")
        }
        binding.button2.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"2")
        }
        binding.button3.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"3")
        }
        binding.button4.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"4")
        }
        binding.button5.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"5")
        }
        binding.button6.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"6")
        }
        binding.button7.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"7")
        }
        binding.button8.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"8")
        }
        binding.button9.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"9")
        }
        binding.buttonPeriod.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,".")
        }

        binding.addButton.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"+")
        }
        binding.minusButton.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"-")
        }
        binding.multiButton.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"×")
        }
        binding.divideButton.setOnClickListener{
            binding.inputTV.text = addToInputText(binding,"÷")
        }
        binding.equalButton.setOnClickListener{
            showResult()
        }


    }

    private fun addToInputText(binding: ActivityMainBinding,buttonValue: String): String {
        return "${binding.inputTV.text}$buttonValue"
    }
    private fun getInputExpression(): String{
        var expression = binding.inputTV.text.replace(Regex("÷"),"/")
            expression = expression.replace(Regex("×"),"*")
        return expression
    }
}
