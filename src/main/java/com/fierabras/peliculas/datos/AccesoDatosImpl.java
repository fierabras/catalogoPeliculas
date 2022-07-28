package com.fierabras.peliculas.datos;

import com.fierabras.peliculas.domain.Pelicula;

import java.util.List;

public class AccesoDatosImpl implements AccesoDatos {
    @Override
    public boolean existe(String nombreArchivo) {
        return false;
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        return null;
    }

    @Override
    public void crear(String nombreArchivo) {

    }

    @Override
    public void borrar(String nombreArchivo) {

    }
}
