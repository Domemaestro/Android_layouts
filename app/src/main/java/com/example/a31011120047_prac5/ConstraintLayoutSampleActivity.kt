package com.example.a31011120047_prac5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ConstraintLayoutSampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout_sample)

        val btn1 = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button5)
        val btn4 = findViewById<Button>(R.id.button3)
        val btn5 = findViewById<Button>(R.id.button4)
        val btn6 = findViewById<Button>(R.id.button7)
        val btn7 = findViewById<Button>(R.id.button8)

        btn1.setOnClickListener {
            Toast.makeText(this,"Orange",Toast.LENGTH_LONG).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this,"Blue",Toast.LENGTH_LONG).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this,"Yellow",Toast.LENGTH_LONG).show()
        }
        btn4.setOnClickListener {
            Toast.makeText(this,"Green",Toast.LENGTH_LONG).show()
        }
        btn5.setOnClickListener {
            Toast.makeText(this,"Orange",Toast.LENGTH_LONG).show()
        }
        btn6.setOnClickListener {
            Toast.makeText(this,"Blue",Toast.LENGTH_LONG).show()
        }
        btn7.setOnClickListener {
            Toast.makeText(this,"Yellow",Toast.LENGTH_LONG).show()
        }


//        for table layout
        val tNextL = findViewById<Button>(R.id.tNextL)
        tNextL.setOnClickListener {
            openTableL()
        }
    }

    private fun openTableL(){
        val tIntent = Intent(this,TableLayoutSampleActivity::class.java)
        startActivity(tIntent)
    }
}