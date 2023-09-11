package com.projeto.falefacensserver.controller;

import com.projeto.falefacensserver.model.Categoria;
import com.projeto.falefacensserver.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public ResponseEntity<List<Categoria>> listAllCategory() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Categoria> findCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Categoria> createCategory(@Valid @RequestBody Categoria category) {
        return ResponseEntity.ok(service.create(category));
    }

    @PutMapping
    public ResponseEntity<Categoria> updateCategory(@Valid @RequestBody Categoria categoria) {
        return ResponseEntity.ok(service.update(categoria));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCategory(Long id) {
        this.service.delete(id);
        return ResponseEntity.ok().build();
    }

}
