package app.personas;

import java.util.List;

import app.INominable;

/**
 * Actor
 */
public class Actor extends Persona implements INominable {

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo trailer de escenas de " + this.nombre);

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

    public void decirDiscurso() {
        System.out.println("Quiero agradecer a montoto");
    }

}