package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {
    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int nro) {
        // Recorrer cada episodio
        // Si el nro de episodio del ciclo es igual a "nro"
        // Devolver esa episodio

        for (Episodio epi : this.episodios) {
            if (epi.numero == nro) {
                return epi;
            }

        }

        return null;
    }

    
}