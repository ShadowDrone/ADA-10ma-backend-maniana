package ar.com.ada.api.rrhh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.rrhh.entities.Categoria;
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

}