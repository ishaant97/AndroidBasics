package com.example.androidbasics

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PizzaApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_app)

        var selectYourPizzaRadioGroup = findViewById<RadioGroup>(R.id.selectYourPizza)
//        var MargheritaRadioButton = findViewById<RadioButton>(R.id.radioButton1)
//        var VeggiePizzaRadioButton = findViewById<RadioButton>(R.id.radioButton2)
//        var PepperoniPizzaRadioButton = findViewById<RadioButton>(R.id.radioButton3)
        var selectPizzaSizeRadioGroup = findViewById<RadioGroup>(R.id.selectPizzaSize)
//        var RegularRadioButton = findViewById<RadioButton>(R.id.radioButton4)
//        var MediumRadioButton = findViewById<RadioButton>(R.id.radioButton5)
//        var LargeRadioButton = findViewById<RadioButton>(R.id.radioButton6)
        var ExtraCheeseCheckBox = findViewById<CheckBox>(R.id.checkBox)
        var OnionsCheckBox = findViewById<CheckBox>(R.id.checkBox2)
        var BlackOlivesCheckBox = findViewById<CheckBox>(R.id.checkBox3)
        var OrderNowButton = findViewById<Button>(R.id.button)

        OrderNowButton.setOnClickListener {
            val selectedPizzaId = selectYourPizzaRadioGroup.checkedRadioButtonId
            val selectedPizza = findViewById<RadioButton>(selectedPizzaId)
            val pizzaType = selectedPizza.text.toString()

            val selectedSizeId = selectPizzaSizeRadioGroup.checkedRadioButtonId
            val selectedSize = findViewById<RadioButton>(selectedSizeId)
            val pizzaSize = selectedSize.text.toString()

            val toppings = mutableListOf<String>()
            if (ExtraCheeseCheckBox.isChecked) {
                toppings.add(ExtraCheeseCheckBox.text.toString())
            }
            if (OnionsCheckBox.isChecked) {
                toppings.add(OnionsCheckBox.text.toString())
            }
            if (BlackOlivesCheckBox.isChecked) {
                toppings.add(BlackOlivesCheckBox.text.toString())
            }
            val toppingsText = if(toppings.isNotEmpty()) {
                "Topping : ${toppings.joinToString(", ")}"
            }
            else{
                "No Extra Toppings Added"
            }

            val orderSummary = """
                You ordered a $pizzaType pizza of size $pizzaSize.
                With toppings: $toppingsText
            """.trimIndent()

            Toast.makeText(this, orderSummary, Toast.LENGTH_LONG).show()
        }
    }
}