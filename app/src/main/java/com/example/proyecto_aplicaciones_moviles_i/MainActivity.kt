package com.example.proyecto_aplicaciones_moviles_i

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Inicializa FirebaseAuth
        val auth: FirebaseAuth = FirebaseAuth.getInstance()

        // Función para registrar un nuevo usuario
        fun registerUser(email: String, password: String) {
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // Registro exitoso
                        val user = auth.currentUser
                        Log.d("FirebaseAuth", "Registro exitoso. Usuario: ${user?.email}")
                    } else {
                        // Si el registro falla, muestra un mensaje de error
                        Log.w("FirebaseAuth", "Error al registrar usuario", task.exception)
                    }
                }
        }

        // Función para logearse un  usuario
        fun logearse(email: String, password: String) {
            val auth: FirebaseAuth = FirebaseAuth.getInstance()

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // Inicio de sesión exitoso
                        val user = auth.currentUser
                        Log.d("FirebaseAuth", "Inicio de sesión exitoso. Usuario: ${user?.email}")
                        Toast.makeText(this, "Inicio Exitoso: ", Toast.LENGTH_SHORT).show()
                        // Puedes aquí redirigir al usuario a una nueva actividad o hacer alguna acción
                    } else {
                        // Si falla, mostrar mensaje de error
                        Log.w("FirebaseAuth", "Error al iniciar sesión", task.exception)
                        // Mostrar un Toast o mensaje al usuario
                        Toast.makeText(
                            this,
                            "Error al iniciar sesión: ${task.exception?.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
        }

// llamado de los metodos
//registerUser("testuser@example.com", "password123")
        logearse("testuser1@example.com", "password123")

    }
}
