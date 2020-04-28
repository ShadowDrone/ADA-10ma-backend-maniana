package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;



/**
 * Contenido
 */
public abstract class Contenido {

    // Declarar variables de instancia: accesor tipo NombreVariable:

    public String nombre;
    public Clasificacion clasificacion;
    public Genero genero;
    public List<Actor> elenco = new ArrayList<>();
    public double calificacion;

    public void reproducir() {

    }
}