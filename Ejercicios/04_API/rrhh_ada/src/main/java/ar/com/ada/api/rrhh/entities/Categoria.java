package ar.com.ada.api.rrhh.entities;

import java.math.BigDecimal;
import java.util.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import ar.com.ada.api.rrhh.entities.calculos.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @Column(name = "categoria_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoriaId;
    private String nombre;
    @Column(name = "sueldo_base")
    private BigDecimal sueldoBase;
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Empleado> empleados;

    /**
     * - Pattern Desgign Strategy: en este caso, se uso como modelo el calculo de
     * sueldos de un empleado. Si el empleado es Administrativo, el sueldo actual no
     * puede ser menor al sueldo de la categoria cuando haya recalculo de sueldos.
     * En el caso de un Auxiliar, el sueldo actual siempre es el sueldo de la
     * categoria . En caso de vendedores, se usa el sueldo de la categoria base +
     * 10% de comisiones sobre ventas. Para este caso se puso una interface
     * SueldoCalculator, que se usa en la clase Categoria para calcular el sueldo.
     * Cuando una categoria tenga nombre Administrativo, Pasasante
     */
    @JsonIgnore
    @Transient
    private SueldoCalculator sueldoStrategy;

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * - Pattern Desgign Strategy: en este caso, se uso como modelo el calculo de
     * sueldos de un empleado. Si el empleado es Administrativo, el sueldo actual no
     * puede ser menor al sueldo de la categoria cuando haya recalculo de sueldos.
     * En el caso de un Auxiliar, el sueldo actual siempre es el sueldo de la
     * categoria . En caso de vendedores, se usa el sueldo de la categoria base +
     * 10% de comisiones sobre ventas. Para este caso se puso una interface
     * SueldoCalculator, que se usa en la clase Categoria para calcular el sueldo.
     * Cuando una categoria tenga nombre Administrativo, Pasasante
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        switch (this.nombre) {

            case "Vendedor":
                this.setSueldoStrategy(new SueldoVendedorCalculator());
                break;
            case "Administrativo":
                this.setSueldoStrategy(new SueldoAdministrativoCalculartor());
                break;
            case "Auxiliar":
                this.setSueldoStrategy(new SueldoAuxiliarCalculator());
                break;

            default:

                // Por ahor default lo ponemos como Administrativo
                this.setSueldoStrategy(new SueldoAdministrativoCalculartor());
                break;
        }
    }

    public BigDecimal getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(BigDecimal sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * @return the sueldoStrategy
     */
    public SueldoCalculator getSueldoStrategy() {

        // si esta en nulo, le genero la estrategy a traves del nombre
        // Cuando vienen desde la db este valor esta en nulo
        // por lo cual lo reasigno.
        if (this.sueldoStrategy == null)
            this.setNombre(this.getNombre());
        return sueldoStrategy;
    }

    /**
     * @param sueldoStrategy the sueldoStrategy to set
     */
    public void setSueldoStrategy(SueldoCalculator sueldoStrategy) {
        this.sueldoStrategy = sueldoStrategy;
    }

    public BigDecimal calcularSueldo(Empleado empleado) {
        return this.getSueldoStrategy().calcularSueldo(empleado);
    }

}