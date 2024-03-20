package com.example.playarchive.ui.theme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.content.Intent
import com.example.playarchive.LibraryActivity
import com.example.playarchive.R
import com.google.firebase.auth.FirebaseAuth
import android.widget.ImageView
import com.example.playarchive.GameDetailActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button
    private lateinit var homeButton: Button
    private lateinit var libraryButton: Button
    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameImage1: ImageView = findViewById(R.id.game_image_1)
        val gameImage2: ImageView = findViewById(R.id.game_image_2)
        val gameImage3: ImageView = findViewById(R.id.game_image_3)
        val gameImage4: ImageView = findViewById(R.id.game_image_4)
        val gameImage5: ImageView = findViewById(R.id.game_image_5)

        gameImage1.setOnClickListener { navigateToGameDetail("The Outlast Trials") }
        gameImage2.setOnClickListener { navigateToGameDetail("Dragon's Dogma 2") }
        gameImage3.setOnClickListener { navigateToGameDetail("Rise of the Ronin") }
        gameImage4.setOnClickListener { navigateToGameDetail("Princess Peach Showtime") }
        gameImage5.setOnClickListener { navigateToGameDetail("Alone in the Dark") }

        usernameInput = findViewById(R.id.editTextEmail)
        passwordInput = findViewById(R.id.editTextPassword)
        loginBtn = findViewById(R.id.buttonLogin)
        homeButton = findViewById(R.id.home_button)
        libraryButton = findViewById(R.id.library_button)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            if (validateCredentials(username, password)) {
                performLogin(username, password)
            } else {
                Log.e("Login", "Invalid credentials")
                Toast.makeText(baseContext, "Invalid credentials.", Toast.LENGTH_SHORT).show()
            }
        }

        homeButton.setOnClickListener {
            // Handle home button action, if necessary
        }

        libraryButton.setOnClickListener {
            val intent = Intent(this, LibraryActivity::class.java)
            startActivity(intent)
        }
    }

    private fun performLogin(username: String, password: String) {
        auth.signInWithEmailAndPassword(username, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d("Login", "signInWithEmail:success")
                    val user = auth.currentUser
                    // Perform further actions based on successful login
                } else {
                    Log.w("Login", "signInWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    private fun validateCredentials(username: String, password: String): Boolean {
        // You would replace this with real validation logic
        return username.isNotBlank() && password.isNotBlank()
    }

    private fun navigateToGameDetail(gameTitle: String) {
        val intent = Intent(this, GameDetailActivity::class.java).apply {
            putExtra("GAME_TITLE", gameTitle)
        }
        startActivity(intent)
    }
}
