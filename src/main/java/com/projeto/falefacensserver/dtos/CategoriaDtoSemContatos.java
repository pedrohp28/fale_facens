package com.projeto.falefacensserver.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDtoSemContatos {
    private Long id;
    private String nome;
}
