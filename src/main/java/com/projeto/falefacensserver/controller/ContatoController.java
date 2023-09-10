package com.projeto.falefacensserver.controller;

import com.projeto.falefacensserver.model.Contato;
import com.projeto.falefacensserver.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    public ResponseEntity<List<Contato>> listAllContact() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Contato> findContactById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Contato> createContact(@Valid @RequestBody Contato contact) {
        return ResponseEntity.ok(service.create(contact));
    }

    @PutMapping
    public ResponseEntity<Contato> updateContact(@Valid @RequestBody Contato contact) {
        return ResponseEntity.ok(service.update(contact));
    }

    public ResponseEntity<?> deleteContact(Long id) {
        this.service.delete(id);
        return ResponseEntity.ok().build();
    }
}
