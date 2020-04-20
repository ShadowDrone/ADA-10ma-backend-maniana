package app;

import java.util.ArrayList;
import java.util.List;



/**
 * Contenido
 */
public class Contenido {

    // Declarar variables de instancia: accesor tipo NombreVariable:

    public String nombre;
    public Clasificacion clasificacion;
    public Genero genero;
    public List<Actor> elenco = new ArrayList<>();
    public double calificacion;

    public void reproducir() {

    }
}