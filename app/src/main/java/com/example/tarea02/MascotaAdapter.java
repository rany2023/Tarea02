package com.example.tarea02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MascotaAdapter extends ArrayAdapter<Mascota> {

    public MascotaAdapter(Context context, List<Mascota> mascotas) {
        super(context, 0, mascotas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_mascota, parent, false);
        }

        ImageView imgMascota = convertView.findViewById(R.id.imgMascota);
        TextView txtNombre = convertView.findViewById(R.id.txtNombreMascota);

        Mascota mascota = getItem(position);

        if (mascota != null) {
            txtNombre.setText(mascota.getNombre());
            imgMascota.setImageResource(mascota.getImagen());
        }

        return convertView;
    }
}
