package com.fierabras.peliculas.negocio;

public interface CatalogoPeliculas {
    void agregarPelicula(String nombrePelicula, String nombreArchivo);

    void listarPeliculas(String nombreArchivo);

    void buscarPelicula(String nombreArchivo, String buscar);

    void iniciaArchivo(String nombreArchivo);

}
