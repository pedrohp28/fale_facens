package com.projeto.falefacensserver.service;

import com.projeto.falefacensserver.dtos.CategoriaDto;
import com.projeto.falefacensserver.dtos.ContatoDto;
import com.projeto.falefacensserver.dtos.ContatoDtoSemCategoria;
import com.projeto.falefacensserver.dtos.DadosCategoriaDto;
import com.projeto.falefacensserver.exceptions.ResourceNotFoundException;
import com.projeto.falefacensserver.model.Categoria;
import com.projeto.falefacensserver.model.Contato;
import com.projeto.falefacensserver.repositoy.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaDto> findAll() {
        List<CategoriaDto> categorias = categoriaRepository.findAll()
                .stream().map((Categoria c) -> {
                    List<Long> contato = c.getContato().stream().map((Contato con) -> con.getId()).collect(Collectors.toList());
                    return CategoriaDto.builder()
                            .id(c.getId())
                            .nome(c.getNome())
                            .contatoId(contato)
                            .build();
                }).collect(Collectors.toList());
        return categorias;
    }

    public DadosCategoriaDto findById(Long id) {
        return categoriaRepository.findById(id).map((Categoria c) -> {
            return DadosCategoriaDto.builder()
                    .id(c.getId())
                    .nome(c.getNome())
                    .contatos(c.getContato() != null ?
                            c.getContato().stream().map((Contato con) -> {
                                return ContatoDtoSemCategoria.builder()
                                        .id(con.getId())
                                        .nome(con.getNome())
                                        .email(con.getEmail())
                                        .telefone(con.getTelefone())
                                        .build();
                            }).collect(Collectors.toList()) : null
                    ).build();
        }).orElseThrow(() -> new ResourceNotFoundException("Id da categoria não encontrada."));
    }

    public CategoriaDto create(CategoriaDto categoriaDto) {
        Categoria categoria = new Categoria();
        categoria.setNome(categoriaDto.getNome());

        Categoria categoriaComId = categoriaRepository.save(categoria);
        categoriaDto.setId(categoriaComId.getId());
        return categoriaDto;
    }

    public CategoriaDto update(CategoriaDto categoriaDto) {
        Categoria categoria = categoriaRepository.findById(categoriaDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Id da categoria não encontrada."));
        categoria.setNome(categoriaDto.getNome());
        categoriaRepository.save(categoria);
        return categoriaDto;
    }

    public void delete(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id da categoria não encontrada."));
        categoriaRepository.delete(categoria);
    }
}
