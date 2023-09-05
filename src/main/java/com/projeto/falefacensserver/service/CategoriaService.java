package com.projeto.falefacensserver.service;

import com.projeto.falefacensserver.exceptions.ResourceNotFoundException;
import com.projeto.falefacensserver.model.Categoria;
import com.projeto.falefacensserver.repositoy.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll() {
        return repository.findAll();
    }

    public Categoria findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records founds for this ID!"));
    }

    public Categoria create(Categoria categoria) {
        return repository.save(categoria);
    }

    public Categoria update(Categoria categoria) {
        Categoria entity = repository.findById(categoria.getId()).orElseThrow(() -> new ResourceNotFoundException("No records founds for this ID!"));

        entity.setNome(categoria.getNome());
        entity.setContato(categoria.getContato());

        repository.save(entity);

        return entity;
    }

    public void delete(Long id) {
        Categoria categoria = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records founds for this ID!"));
        repository.delete(categoria);
    }
}
