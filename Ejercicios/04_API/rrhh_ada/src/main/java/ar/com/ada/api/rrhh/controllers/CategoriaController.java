package ar.com.ada.api.rrhh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.rrhh.entities.Categoria;
import ar.com.ada.api.rrhh.entities.Empleado;
import ar.com.ada.api.rrhh.models.responses.CategoriasNombresResponse;
import ar.com.ada.api.rrhh.services.CategoriaService;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping("/categorias") // Se debe cambiar el metodo void para poder devolver a Front
    public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria) {

        categoriaService.crearCategoria(categoria);

        return ResponseEntity.ok(categoria);

    }

    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> listarCategorias() {

        return ResponseEntity.ok(categoriaService.listarCategorias());

    }

    
    @GetMapping("/categorias/sueldos-nuevos")
    public ResponseEntity<List<Empleado>> getSueldosNuevos() {

        return ResponseEntity.ok(categoriaService.calcularProximosSueldos());

    }

    @GetMapping("/categorias/sueldos-actuales")
    public ResponseEntity<List<Empleado>> getSueldosActuales() {

        return ResponseEntity.ok(categoriaService.obtenerSueldosActuales());

    }

    @GetMapping("/categorias/vacias")
    public ResponseEntity<List<Categoria>> getCategoriasSinEmpleados() {

        return ResponseEntity.ok(categoriaService.obtenerCategoriasSinEmpleados());

    }

    @GetMapping("/categorias/nombres")
    public ResponseEntity<CategoriasNombresResponse> getCategoriasNombres() {

        CategoriasNombresResponse r = new CategoriasNombresResponse();

        r.nombres = categoriaService.obtenerNombresCategorias();
        return ResponseEntity.ok(r);

    }
}