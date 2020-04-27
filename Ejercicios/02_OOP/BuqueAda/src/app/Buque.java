package app;

import java.util.*;

public class Buque {

    private List<Contenedor> contenedores = new ArrayList<>();

    public List<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setContenedores(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public void agregarContenedor(Contenedor contenedor) {
        this.getContenedores().add(contenedor);
    }

    public double calcularPesoTotal() {
        double suma = 0;

        for (Contenedor contenedor : contenedores) {
            suma = contenedor.getPeso();
        }

        return suma;
    }

    public Contenedor buscarContenedorMaximo() {
        double pesoMaximo = 0;
        Contenedor contenedorMax = null;

        for (Contenedor contenedor : contenedores) {
            if (contenedor.getPeso() > pesoMaximo) {
                pesoMaximo = contenedor.getPeso();
                contenedorMax = contenedor;
            }
        }

        return contenedorMax;
    }

    public int contarContenedores(Puerto puerto) {
        int cantidad = 0;

        for (Contenedor contenedor : contenedores) {
            if (contenedor.getPuerto().getNumero() == puerto.getNumero()) {
                cantidad++;
            }
        }

        return cantidad;
    }

}