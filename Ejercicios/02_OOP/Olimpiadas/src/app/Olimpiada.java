package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Olimpiada
 */
public class Olimpiada {

    //Lista de Deportistas
    //Atributo de CLASE/ variable de Clase(porque puse static)
    public List<Deportista> participantes = new ArrayList<>();

    public void inscribir(Deportista deportista){
        this.participantes.add(deportista);
    }

}