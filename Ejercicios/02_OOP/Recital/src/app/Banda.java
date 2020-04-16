package app;

import java.util.ArrayList;
import java.util.List;

public class Banda extends Artista {

    public int cantidadIntegrantes;

    public List<Tema> temas = new ArrayList<>();

    public void tocar(String nombreTema) {
        Tema tema = buscarTema(nombreTema);

        tema.comenzar();

    }

    public Tema buscarTema(String nombreTema) {
        for (Tema tema : this.temas) {
            if (tema.nombre.equals(nombreTema)) {
                return tema;
            }
        }

        return null;
    }
}