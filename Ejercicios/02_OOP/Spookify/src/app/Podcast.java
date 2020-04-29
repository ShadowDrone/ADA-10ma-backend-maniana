package app;

/**
 * Podcast
 */
public class Podcast extends Contenido {

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo un podcast " + this.nombre);
    }
}