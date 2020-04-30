package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Album
 */
public class Album {

    public Album(){

    }

    public Album(String nombre){
        this.nombre = nombre;
    }

    public Album(int anio, String nombre){
        this.nombre = nombre;
        this.anio = anio;
    }
    public String nombre;
    // AÑo lanzamientos
    public int anio;
    public Artista artista;
    public List<Cancion> canciones = new ArrayList<>();

    public Cancion buscarCancion(String nombre) {
        for (Cancion cancion : this.canciones) {
            if (cancion.nombre.equals(nombre))
                return cancion;
        }
        return null;
    }
}