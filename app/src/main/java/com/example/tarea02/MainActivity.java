
package com.example.tarea02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContinuar = findViewById(R.id.btnContinuar);
        Button btnVerMascotas = findViewById(R.id.btnVerMascotas);

        btnContinuar.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    RegistroActivity.class
            );
            startActivity(intent);
        });

        btnVerMascotas.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    ListaMascotasActivity.class
            );
            startActivity(intent);
        });
    }
}

