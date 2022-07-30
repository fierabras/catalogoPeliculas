package com.fierabras.peliculas.datos;

import com.fierabras.peliculas.domain.Pelicula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosArchivoTxt implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) {

        var archivo = new File(nombreArchivo);
        List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();

            while (lectura != null) {
                var pelicula = new Pelicula();
                pelicula.setNombre(lectura);
                listaPeliculas.add(pelicula);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return listaPeliculas;

    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

        var archivo = new File(nombreArchivo);

        try {
            var salida = new PrintWriter(new FileWriter(nombreArchivo, true));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha agregado la pelicula " + pelicula.getNombre() + "en el archivo");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        var lista = this.listar(nombreArchivo);
        for (Pelicula elemento : lista) {
            if(elemento.getNombre().equals(buscar)){
                return elemento.toString();
            }
        }
        return null;
    }

    @Override
    public void crear(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void borrar(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha borrado el archivo");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
