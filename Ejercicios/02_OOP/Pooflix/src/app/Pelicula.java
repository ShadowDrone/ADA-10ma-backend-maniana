package app;

import java.util.List;

/**
 * Peli
 */
public class Pelicula extends Contenido implements INominable {

    public Director director;

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        
        System.out.println("Reproduciendo trailer de pelicula "+this.nombre);
    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean estaNominada() {
        // TODO Auto-generated method stub
        return false;
    }

    
}