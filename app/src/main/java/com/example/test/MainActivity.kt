package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.View
import com.example.test.R
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        val auth = FirebaseAuth.getInstance()

        usernameInput = findViewById(R.id.editTextEmail)
        passwordInput = findViewById(R.id.editTextPassword)
        loginBtn = findViewById(R.id.buttonLogin)

        loginBtn.setOnClickListener { view: View ->
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            if (validateCredentials(username, password)) {
                // Les informations d'id sont valides, effectuer connexion
                auth.signInWithEmailAndPassword(username, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // L'authentification a réussi, effectuer l'action de connexion appropriée ici
                            Log.d("Login", "signInWithEmail:success")
                            val user = auth.currentUser
                            // Par exemple, ouvrir une nouvelle activité
                        } else {
                            // L'authentification a échoué, affichez un message d'erreur à l'utilisateur
                            Log.w("Login", "signInWithEmail:failure", task.exception)
                            Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                // Les informations d'id non valides, afficher un message d'erreur
                Log.e("Login", "Invalid credentials")
            }
        }
    }

    // Méthode pour valider les informations d'identification
    private fun validateCredentials(username: String, password: String): Boolean {
        return username == "utilisateur" && password == "motdepasse"
    }

    // Méthode pour effectuer la connexion
    private fun performLogin(username: String) {
        Log.i("Login", "User logged in: $username")
    }
}

