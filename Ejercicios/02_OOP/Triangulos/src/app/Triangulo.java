package app;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo() {
    }

    /**
     * En este caso reutilizo la funcion esEquilatero() y es esIsoceles(), pero
     * perdemos la llamada a escaleno
     * 
     * @return
     */
    public String resolverTipo() {
        if (this.esEquilatero())
            return "Equilatero";
        else if (this.esIsosceles())
            return "Isosceles";
        else
            return "Escaleno";
    }

    /**
     * En este caso dejo la logica de Equilatero en una funcion
     * 
     * @return
     */
    public boolean esEquilatero() {
        if (lado1 == lado2 && lado2 == lado3)
            return true;
        return false;
    }

    /**
     * En este caso dejo la logica de Isosceles en una funcion
     * 
     * @return
     */
    public boolean esIsosceles() {
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return true;
        return false;
    }

    /**
     * En este caso dejo la logica de Escaleno
     * 
     * @return
     */
    public boolean esEscaleno() {
        if (!this.esEquilatero() && !this.esIsosceles())
            return true;
        return false;
    }

    /**
     * En este caso creamos toda la logica en un solo lugar, para luego llamarlo en
     * los diferentes metodos.
     * 
     * @return
     */
    public String resolverTipoV2() {
        if (lado1 == lado2 && lado2 == lado3)
            return "Equilatero";
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return "Isosceles";
        else
            return "Escaleno";
    }

    /**
     * Llamo a la logica de resolver tipo
     * 
     * @return
     */
    public boolean esEquilateroV2() {
        return this.resolverTipoV2().equals("Equilatero");
    }

    /**
     * Llamo a la logica de resolver tipo
     * 
     * @return
     */
    public boolean esIsoscelesV2() {
        return this.resolverTipoV2().equals("Isosceles");
    }

    /**
     * Llamo a la logica de resolver tipo
     * 
     * @return
     */
    public boolean esEscalenoV2() {
        return this.resolverTipoV2().equals("Escaleno");
    }

    /**
     * Este caso, la logica esta en este metodo y tambien la responsabilidad de
     * imprimir. No deberia haber un metodo asi.
     */
    public void decirTipo() {
        if (lado1 == lado2 && lado2 == lado3)
            System.out.println("El triangulo es Equilatero");
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            System.out.println("El triangulo es Isosceles");
        else
            System.out.println("El triangulo es Escaleno");
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
}