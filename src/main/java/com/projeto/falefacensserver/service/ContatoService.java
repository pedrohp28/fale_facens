package com.projeto.falefacensserver.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projeto.falefacensserver.dtos.CategoriaDto;
import com.projeto.falefacensserver.dtos.CategoriaDtoSemContatos;
import com.projeto.falefacensserver.dtos.ContatoDto;
import com.projeto.falefacensserver.dtos.DadosContatoDto;
import com.projeto.falefacensserver.exceptions.ResourceNotFoundException;
import com.projeto.falefacensserver.model.Categoria;
import com.projeto.falefacensserver.model.Contato;
import com.projeto.falefacensserver.repositoy.CategoriaRepository;
import com.projeto.falefacensserver.repositoy.ContatoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepositoy contatoRepositoy;
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<ContatoDto> findAll() {
        List<ContatoDto> contatos = contatoRepositoy.findAll()
                .stream().map((Contato c) -> {
                    return ContatoDto.builder()
                            .id(c.getId())
                            .nome(c.getNome())
                            .email(c.getEmail())
                            .telefone(c.getTelefone())
                            .categoriaId(c.getCategoria() == null ? null : c.getCategoria().getId())
                            .build();
                }).collect(Collectors.toList());
        return contatos;
    }

    public DadosContatoDto findById(Long id) {
        return contatoRepositoy.findById(id).map((Contato c) -> {
            return DadosContatoDto.builder()
                    .id(c.getId())
                    .nome(c.getNome())
                    .email(c.getEmail())
                    .telefone(c.getTelefone())
                    .categoria(c.getCategoria() != null ?
                            CategoriaDtoSemContatos.builder()
                                    .id(c.getCategoria().getId())
                                    .nome(c.getCategoria().getNome())
                                    .build() : null
                    ).build();
        }).orElseThrow(() -> new ResourceNotFoundException("Id de produto não encontrado."));
    }

    public ContatoDto create(ContatoDto contatoDto) {
        Categoria categoria = categoriaRepository.findById(
                contatoDto.getCategoriaId()).orElseThrow(
                () -> new ResourceNotFoundException("Id da categoria não encontrada"));
        Contato contato = new Contato();
        contato.setNome(contatoDto.getNome());
        contato.setEmail(contatoDto.getEmail());
        contato.setTelefone(contatoDto.getTelefone());
        contato.setCategoria(categoria);
        Contato contatoComId = contatoRepositoy.save(contato);
        contatoDto.setId(contatoComId.getId());
        return contatoDto;
    }

    public ContatoDto update(ContatoDto contatoDto) {
        Contato contato = contatoRepositoy.findById(contatoDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Id do contato não encontrado."));
        Categoria categoria = categoriaRepository.findById(contatoDto.getCategoriaId())
                .orElseThrow(() -> new ResourceNotFoundException("Id da categoria não encontrada."));
        contato.setNome(contatoDto.getNome());
        contato.setEmail(contatoDto.getEmail());
        contato.setTelefone(contatoDto.getTelefone());
        contato.setCategoria(categoria);
        contatoRepositoy.save(contato);
       return contatoDto;
    }

    public void delete(Long id) {
        Contato contato = contatoRepositoy.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id do contato não encontrado."));
        contatoRepositoy.delete(contato);
    }
}
