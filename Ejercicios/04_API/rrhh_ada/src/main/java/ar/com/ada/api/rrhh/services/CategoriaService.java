package ar.com.ada.api.rrhh.services;

import java.util.*;

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
}