package com.example.a31011120047_prac5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class RelativeLayoutSampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout_sample)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        val submit = findViewById<Button>(R.id.submit)
        val uname = findViewById<EditText>(R.id.uname)

        //Toast for first three buttons
        btn1.setOnClickListener {
            Toast.makeText(this,"Button 1",Toast.LENGTH_LONG).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this,"Button 2",Toast.LENGTH_LONG).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this,"Button 3",Toast.LENGTH_LONG).show()
        }

        //alert box
        submit.setOnClickListener {
            val userN = uname.text.toString()
            val build = AlertDialog.Builder(this)
            build.setTitle("Info")
            build.setMessage("username: "+userN)
            build.show()

        }

        //for constraint layout
        val cNextL = findViewById<Button>(R.id.cNextL)
        cNextL.setOnClickListener {
            openConstraintL()
        }
    }
    private fun openConstraintL(){
        val cIntent = Intent(this,ConstraintLayoutSampleActivity::class.java)
        startActivity(cIntent)
    }

}