package ar.com.ada.api.rrhh.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.rrhh.entities.*;
import ar.com.ada.api.rrhh.repos.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repository;

    public void crearCategoria(Categoria categoria) {
        repository.save(categoria);

    }

    public List<Categoria> listarCategorias() {

        return repository.findAll();

    }

    public List<Empleado> traerEmpleadosPorCategoria(int categoriaId) {

        Optional<Categoria> cOptional = repository.findById(categoriaId);
        List<Empleado> listaVacia = new ArrayList<>(); // listavacia
        if (cOptional.isPresent()) {
            return (cOptional.get()).getEmpleados(); // cOptional.get devuelve un objeto categoria.
        }
        return listaVacia; // o sino return new Arraylist<>() sin declararla arriba.
    }

    public Categoria buscarCategoriaPorId(int categoriaId) {

        Optional<Categoria> cOptional = repository.findById(categoriaId);

        if (cOptional.isPresent()) {

            return cOptional.get();

        }
        return null;
    }

    public List<Categoria> getCategorias() {

        return repository.findAll();
    }

    public List<Empleado> calcularProximosSueldos() {
        List<Empleado> empleados = new ArrayList<>();

        this.getCategorias().stream().forEach(categoria -> {

            categoria.getEmpleados().stream().forEach(empleado -> {

                empleado.setSueldo(categoria.calcularSueldo(empleado));
                empleados.add(empleado);
            });

        });

        return empleados;
    }

    public List<Empleado> obtenerSueldosActuales() {
        List<Empleado> empleados = new ArrayList<>();

        this.getCategorias().stream().forEach(cat -> empleados.addAll(cat.getEmpleados()));

        return empleados;
    }

    /**
     * Modo normal.
     * 
     * @return
     */
    public List<Categoria> obtenerCategoriasSinEmpleadosEstandard() {

        List<Categoria> categoriasSinEmpleados = this.getCategorias();

        for (Categoria categoria : categoriasSinEmpleados) {

            if (categoria.getEmpleados().size() == 0)
                categoriasSinEmpleados.add(categoria);
        }

        return categoriasSinEmpleados;

    }

    /**
     * Modo funcional, se crea un stream, se le pasa el filter, y luego del filter
     * una condicion, esa condicion se eevalua para cada elemento, devolviendo un
     * stream de aquellos qeu el filtro haya sido verdadero. Finalmente se los toma
     * y se tranforma a una lista Otros metodos interesantes de funcional son
     * anyMatch y allMatch que detecta si hay algun elemento que cumpla una
     * condicion, o todos respectivamente.
     * 
     * @return
     */
    public List<Categoria> obtenerCategoriasSinEmpleados() {

        return this.getCategorias().stream().filter(cat -> cat.getEmpleados().size() == 0).collect(Collectors.toList());

    }

    /**
     * Modo normal, procedural como antes.
     * 
     * @return
     */
    public List<String> obtenerNombresCategoriasEstandar() {

        List<String> nombres = new ArrayList<>();

        for (Categoria categoria : this.getCategorias()) {

            nombres.add(categoria.getNombre());
        }

        return nombres;

    }

    /**
     * Modo funcional, se crea un stream, se mapea cada elemento(recorre) un stream
     * y el segundo, en caso de ser un array de arrays de X, deuvelve un array de X
     * 
     * @return
     */
    public List<String> obtenerNombresCategorias() {

        return this.getCategorias().stream().map(categoria -> categoria.getNombre()).collect(Collectors.toList());

    }
}