package com.projeto.falefacensserver.controller;

import com.projeto.falefacensserver.dtos.ContatoDto;
import com.projeto.falefacensserver.dtos.DadosContatoDto;
import com.projeto.falefacensserver.service.ContatoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContatoController {

    @Autowired
    private ContatoService service;

    @GetMapping
    @Operation(description = "Rota responsável por listar todos os contatos.", tags = "Contato")
    public ResponseEntity<List<ContatoDto>> listAllContact() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    @Operation(description = "Rota responsável por buscar um contato por ID.", tags = "Contato")
    public ResponseEntity<DadosContatoDto> findContactById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @Operation(description = "Rota responsável por criar um contato.", tags = "Contato")
    public ResponseEntity<ContatoDto> createContact(@Valid @RequestBody ContatoDto contact) {
        return ResponseEntity.ok(service.create(contact));
    }

    @PutMapping
    @Operation(description = "Rota responsável por atualizar um contato.", tags = "Contato")
    public ResponseEntity<ContatoDto> updateContact(@Valid @RequestBody ContatoDto contact) {
        return ResponseEntity.ok(service.update(contact));
    }

    @DeleteMapping("{id}")
    @Operation(description = "Rota responsável por deletar um contato por ID.", tags = "Contato")
    public ResponseEntity<?> deleteContact(@PathVariable Long id) {
        this.service.delete(id);
        return ResponseEntity.ok().build();
    }
}
