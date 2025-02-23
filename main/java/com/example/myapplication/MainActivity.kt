package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme


import android.widget.Button
import android.widget.TextView

class MainActivity : ComponentActivity() {

    private lateinit var textView: TextView
    private var isWelcome = true
    private var languageIndex = 0
    private val languages = listOf(
        "Bienvenido",   // Español
        "Welcome",      // Inglés
        "Bienvenue",    // Francés
        "Bem-vindo"     // Portugués
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            languageIndex = (languageIndex + 1) % languages.size
            textView.text = languages[languageIndex]
        }
    }
}