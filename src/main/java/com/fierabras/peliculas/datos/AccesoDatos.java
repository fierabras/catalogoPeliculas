package com.fierabras.peliculas.datos;

import com.fierabras.peliculas.domain.Pelicula;

import java.util.List;

public interface AccesoDatos {

    public boolean existe(String nombreArchivo);

    public List<Pelicula> listar(String nombre);

    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);

    public String buscar(String nombreArchivo, String buscar);

    public void crear(String nombreArchivo);

    public void borrar(String nombreArchivo);

}
