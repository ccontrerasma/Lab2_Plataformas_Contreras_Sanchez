package com.example.lab2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String username = getIntent().getStringExtra("username"); // Obtener el nombre de usuario
        TextView welcomeMessage = findViewById(R.id.welcomeMessage);
        welcomeMessage.setText("Bienvenido " + username); // Mostrar el mensaje de bienvenida
    }
}