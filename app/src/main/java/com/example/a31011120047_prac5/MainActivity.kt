package com.example.a31011120047_prac5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.user_name)
        val phoneN = findViewById<EditText>(R.id.phone_no)
        val email = findViewById<EditText>(R.id.email_id)

        val submit = findViewById<Button>(R.id.submit)
        val clear = findViewById<Button>(R.id.cancel)

        submit.setOnClickListener {
            val uName = name.text.toString()
            val phone = phoneN.text.toString()
            val emailID = email.text.toString()
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Info")
            builder.setMessage("Username: "+uName+"\nPhone No:"+phone+"\nEmail ID: "+emailID)
            builder.show()
        }

        clear.setOnClickListener {
            name.text.clear()
            phoneN.text.clear()
            email.text.clear()

        }

        //for relative layout
        val rNextL = findViewById<Button>(R.id.change_layout)
        rNextL.setOnClickListener {
            openRelativeL()
        }
    }

    //for relative layout
    private fun openRelativeL(){
        val intent = Intent(this,RelativeLayoutSampleActivity::class.java)
        startActivity(intent)
    }

}