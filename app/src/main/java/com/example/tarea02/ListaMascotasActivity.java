package com.example.tarea02;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListaMascotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);

        ListView listaMascotas = findViewById(R.id.listaMascotas);

        ArrayList<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Mascota("Bonita", R.drawable.bonita));
        mascotas.add(new Mascota("Pata Blanca", R.drawable.pata_blanca));
        mascotas.add(new Mascota("Chuletita Chillona", R.drawable.chuletita));
        mascotas.add(new Mascota("Amiguito", R.drawable.amiguito));
        mascotas.add(new Mascota("Tigrilla", R.drawable.tigrilla));

        mascotas.add(new Mascota("Pepa", R.drawable.pepa));
        mascotas.add(new Mascota("Bola", R.drawable.bola));
        mascotas.add(new Mascota("Eiry", R.drawable.eiry));
        mascotas.add(new Mascota("Geory", R.drawable.geory));
        mascotas.add(new Mascota("Vanilita", R.drawable.vanilita));

        MascotaAdapter adaptador = new MascotaAdapter(this, mascotas);

        listaMascotas.setAdapter(adaptador);

        listaMascotas.setOnItemClickListener((parent, view, position, id) -> {
            Mascota seleccionada = mascotas.get(position);

            Toast.makeText(
                    ListaMascotasActivity.this,
                    "¡Conociste a " + seleccionada.getNombre() + "! 🐾",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
