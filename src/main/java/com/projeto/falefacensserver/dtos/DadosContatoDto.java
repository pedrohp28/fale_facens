package com.projeto.falefacensserver.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadosContatoDto {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private CategoriaDtoSemContatos categoria;
}
