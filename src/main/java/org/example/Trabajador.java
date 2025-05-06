package org.example;

public class Trabajador {
    private String nombre;
    private int dni;

    public Trabajador(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
}
