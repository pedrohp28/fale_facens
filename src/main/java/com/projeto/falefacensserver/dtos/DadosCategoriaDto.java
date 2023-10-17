package com.projeto.falefacensserver.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadosCategoriaDto {
    private Long id;
    private String nome;
    private List<ContatoDtoSemCategoria> contatos;
}
