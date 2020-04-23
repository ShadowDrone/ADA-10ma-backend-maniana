package app;

import java.util.List;

/**
 * Episodio
 */
public class Episodio {

    //constructor por defecto
    /*public Episodio() {

    }*/

    //Constructor de 3 parametros.
    //accesor: public
    //NombreClase: nombre de la clase que se quiere instanciar.
    //parametros: los parametros pueden tener cualquier orden y nombre
    public Episodio(int numero, String nombre, double duracion) {

        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    /*public Episodio(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    //No vale la pena
    public Episodio( String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //No vale la pena
    public Episodio( String descripcion, int numero) {
        this.numero = numero;
        this.descripcion = descripcion;
    }*/


    ///NOOOO Hacer contructor con TODAS las variables.
    /*
    public Episodio(int numero, String nombre, double duracion, String descripcion){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }*/

    public int numero;
    public String nombre;
    public double duracion;
    public String descripcion;
    public List<Actor> elenco;
    public int anio;

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}