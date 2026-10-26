package com.example.tarea02;

public class Mascota {

    private String nombre;
    private int imagen;

    public Mascota(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }
}
