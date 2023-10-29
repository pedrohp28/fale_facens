package com.projeto.falefacensserver.controller;

import com.projeto.falefacensserver.dtos.CategoriaDto;
import com.projeto.falefacensserver.dtos.DadosCategoriaDto;
import com.projeto.falefacensserver.service.CategoriaService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(description = "Rota responsável por listar todas as categorias.", tags = "Categoria")
    public ResponseEntity<List<CategoriaDto>> listAllCategory() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    @Operation(description = "Rota responsável por listar categoria por ID.", tags = "Categoria")
    public ResponseEntity<DadosCategoriaDto> findCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @Operation(description = "Rota responsável por criar uma categoria.", tags = "Categoria")
    public ResponseEntity<CategoriaDto> createCategory(@Valid @RequestBody CategoriaDto category) {
        return ResponseEntity.ok(service.create(category));
    }

    @PutMapping
    @Operation(description = "Rota responsável por atualizar uma categoria.", tags = "Categoria")
    public ResponseEntity<CategoriaDto> updateCategory(@Valid @RequestBody CategoriaDto categoria) {
        return ResponseEntity.ok(service.update(categoria));
    }

    @DeleteMapping("{id}")
    @Operation(description = "Rota responsável pela deleção de uma categoria por ID.", tags = "Categoria")
    public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
        this.service.delete(id);
        return ResponseEntity.ok().build();
    }

}
