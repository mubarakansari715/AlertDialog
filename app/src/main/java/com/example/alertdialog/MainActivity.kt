package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_AlertDialog)
        button.setOnClickListener() {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are you IT Sector Employee!!")
            builder.setMessage("Welcome to Brainvire Family")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Clicked Yes!", Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("Cancel") { dialoInterface, which ->
                Toast.makeText(applicationContext, "clicked cancel", Toast.LENGTH_SHORT).show()
            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}