package app;

import java.util.List;

import app.personas.Actor;

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
/*
    public Episodio(int numero, String nombre){
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

    private int numero;
    private String nombre;
    private double duracion;
    private String descripcion;
    private List<Actor> elenco;
    private int anio;



    
    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Actor> getElenco() {
        return elenco;
    }

    public void setElenco(List<Actor> elenco) {
        this.elenco = elenco;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    

}