package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {
    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    /**
     * Obtiene un episodio en base a su numero de episodio
     * 
     * @param nro
     * @return
     */
    public Episodio getEpisodio(int nro) {
        // Recorrer cada episodio
        // Si el nro de episodio del ciclo es igual a "nro"
        // Devolver esa episodio

        for (Episodio epi : this.episodios) {
            if (epi.getNumero() == nro) {
                return epi;
            }

        }

        return null;
    }

    /**
     * Obtiene un episodio en base a la posicion dentro del ArrayList. Recordar que
     * los arraylist la primer posicion es la 0
     * 
     * @param pos
     * @return
     */
    public Episodio getEpisodioAtPosicion(int pos) {
        return this.episodios.get(pos);
    }

    public List<Websodio> obtenerWebsodios() {
        List<Websodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Websodio)
                lista.add((Websodio)epi);
        }
        return lista;
    }

}