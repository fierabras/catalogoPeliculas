package com.fierabras.peliculas.domain;

public class Pelicula {
    private String nombre;

    public Pelicula() {

    }

    public Pelicula(String nombre) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
