package com.projeto.falefacensserver.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDto {
    private Long id;
    private String nome;
    private List<Long> contatoId;
}
