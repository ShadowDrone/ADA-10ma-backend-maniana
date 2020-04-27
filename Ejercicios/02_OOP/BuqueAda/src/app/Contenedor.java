package app;

public class Contenedor {

    private int idContenedor;
    private double peso;
    private Puerto puerto;

    public int getIdContenedor() {
        return idContenedor;
    }

    public void setIdContenedor(int idContenedor) {
        this.idContenedor = idContenedor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Puerto getPuerto() {
        return puerto;
    }

    public void setPuerto(Puerto puerto) {
        this.puerto = puerto;
    }

    public Contenedor(int idContenedor, double peso, Puerto puerto) {
        this.idContenedor = idContenedor;
        this.peso = peso;
        this.puerto = puerto;
    }

    public Contenedor(int idContenedor, double peso) {
        this.idContenedor = idContenedor;
        this.peso = peso;
    }

}