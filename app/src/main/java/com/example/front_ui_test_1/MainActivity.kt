package com.example.front_ui_test_1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button click events
        findViewById<Button>(R.id.start_designing_button).setOnClickListener {
            Toast.makeText(this, "Start Designing clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.watch_demo_button).setOnClickListener {
            Toast.makeText(this, "Watch Demo clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.view_all_templates_button).setOnClickListener {
            Toast.makeText(this, "View All Templates clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.create_new_button).setOnClickListener {
            Toast.makeText(this, "Create New clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.app_store_button).setOnClickListener {
            Toast.makeText(this, "App Store clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.play_store_button).setOnClickListener {
            Toast.makeText(this, "Play Store clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
