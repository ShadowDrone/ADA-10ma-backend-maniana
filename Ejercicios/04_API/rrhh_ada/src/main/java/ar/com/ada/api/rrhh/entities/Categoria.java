package ar.com.ada.api.rrhh.entities;

import java.math.BigDecimal;
import java.util.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @Column(name = "categoria_id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoriaId;
    private String nombre;
    @Column(name = "sueldo_base")
    private BigDecimal sueldoBase;
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Empleado> empleados;

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
}