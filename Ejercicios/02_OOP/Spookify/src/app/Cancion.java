package app;

/**
 * Cancion
 */
public class Cancion extends Contenido {

    public Album album;
    public Artista artista;
    public String letra;

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + this.nombre + " ...");
        System.out.println(this.letra);
    }
}