package com.projeto.falefacensserver.controller;

import com.projeto.falefacensserver.dtos.ContatoDto;
import com.projeto.falefacensserver.dtos.DadosContatoDto;
import com.projeto.falefacensserver.model.Contato;
import com.projeto.falefacensserver.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContatoController {

    @Autowired
    private ContatoService service;

    @GetMapping
    public ResponseEntity<List<ContatoDto>> listAllContact() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<DadosContatoDto> findContactById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<ContatoDto> createContact(@Valid @RequestBody ContatoDto contact) {
        return ResponseEntity.ok(service.create(contact));
    }

    @PutMapping
    public ResponseEntity<ContatoDto> updateContact(@Valid @RequestBody ContatoDto contact) {
        return ResponseEntity.ok(service.update(contact));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteContact(@PathVariable Long id) {
        this.service.delete(id);
        return ResponseEntity.ok().build();
    }
}
