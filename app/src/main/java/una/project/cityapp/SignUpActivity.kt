package una.project.cityapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class SignUpActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val btnCreateAccount = findViewById<Button>(R.id.bntCreateAccount)
        btnCreateAccount.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Toast.makeText(this,"Usuario registrado", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        val existingAccount = findViewById<TextView>(R.id.existingAccount)
        existingAccount.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}