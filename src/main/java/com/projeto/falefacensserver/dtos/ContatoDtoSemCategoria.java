package com.projeto.falefacensserver.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContatoDtoSemCategoria {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
