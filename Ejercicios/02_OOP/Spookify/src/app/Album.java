package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Album
 */
public class Album {

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