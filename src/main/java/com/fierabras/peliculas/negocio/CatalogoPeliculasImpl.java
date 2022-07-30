package com.fierabras.peliculas.negocio;

import com.fierabras.peliculas.datos.AccesoDatos;
import com.fierabras.peliculas.datos.AccesoDatosArchivoTxt;
import com.fierabras.peliculas.domain.Pelicula;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    AccesoDatos datos;
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        var pelicula =new Pelicula(nombrePelicula);
        datos = new AccesoDatosArchivoTxt();
        datos.escribir(pelicula,nombreArchivo,true);

    }

    @Override
    public void listarPeliculas(String nombreArchivo) {

        datos = new AccesoDatosArchivoTxt();
        var lista = datos.listar(nombreArchivo);
        for (Pelicula elemento: lista) {
            System.out.println(elemento.getNombre());
        }


    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        datos = new AccesoDatosArchivoTxt();
        String encontrada = datos.buscar(nombreArchivo,buscar);
        if(encontrada==null){
            System.out.println("La pelicula no existe en el catálogo");
        } else {
            System.out.println("Se ha encontrado en el catalog la " + encontrada);
        }

    }

    @Override
    public void iniciaArchivo(String nombreArchivo) {
        datos = new AccesoDatosArchivoTxt();
        datos.crear(nombreArchivo);
    }
}
