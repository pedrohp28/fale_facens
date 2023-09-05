package com.projeto.falefacensserver.service;

import com.projeto.falefacensserver.exceptions.ResourceNotFoundException;
import com.projeto.falefacensserver.model.Contato;
import com.projeto.falefacensserver.repositoy.ContatoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepositoy repository;

    public List<Contato> findAll() {
        return repository.findAll();
    }

    public Contato findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records founds for this ID!"));
    }

    public Contato create(Contato contato) {
        return repository.save(contato);
    }

    public Contato update(Contato contato) {
       Contato entity = repository.findById(contato.getId()).orElseThrow(() -> new ResourceNotFoundException("No records founds for this ID!"));

       entity.setNome(contato.getNome());
       entity.setEmail(contato.getEmail());
       entity.setTelefone(contato.getTelefone());

       repository.save(entity);

       return entity;
    }

    public void delete(Long id) {
        Contato contato = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records founds for this ID!"));
        repository.delete(contato);
    }
}
