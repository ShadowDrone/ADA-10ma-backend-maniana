package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Pooflix
 */
public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public List<Serie> series = new ArrayList<Serie>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarBreakingBad();
        this.inicializarLucifer();
    }

    public void inicializarBreakingBad() {
        ///
    }
    public void inicializarLucifer() {

    }

}
