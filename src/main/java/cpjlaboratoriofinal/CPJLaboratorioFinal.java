package cpjlaboratoriofinal;

import com.fierabras.peliculas.negocio.CatalogoPeliculas;
import com.fierabras.peliculas.negocio.CatalogoPeliculasImpl;


import java.util.Scanner;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 1;
        String nombreArchivo = "dataBase/catalogo.txt";
        CatalogoPeliculas catalogoPeliculas;

        System.out.println("Seleccione la opcion deseada: \n" +
                "1.- Iniciar catalogo películas\n" +
                "2.- Agregar película\n" +
                "3.- Listar Películas\n" +
                "4.- Buscar Película\n" +
                "0.- Salir");

        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                catalogoPeliculas = new CatalogoPeliculasImpl();
                catalogoPeliculas.iniciaArchivo(nombreArchivo);
                break;
            case 2:
                catalogoPeliculas = new CatalogoPeliculasImpl();
                System.out.println("Indique el nombre de la pelicula a agregar: --> ");
                String nombrePelicula = scanner.nextLine();
                catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
                break;
            case 3:
                catalogoPeliculas = new CatalogoPeliculasImpl();
                catalogoPeliculas.listarPeliculas(nombreArchivo);
                break;
            case 4:
                catalogoPeliculas = new CatalogoPeliculasImpl();
                System.out.println("Indique el nombre de la pelicula a buscar: --> ");
                String nombreBuscar = scanner.nextLine();
                catalogoPeliculas.buscarPelicula(nombreArchivo, nombreBuscar);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.exit(0);
                break;
        }


    }

}
