package se.rasmus.ecco.welcomeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mintext = findViewById<TextView>(R.id.Welcome)
        mintext.text = "Welcome"

        var minknapp = findViewById<Button>(R.id.button)
        minknapp.setOnClickListener {
            mintext.text = "Goodbye"
        }
    }
}