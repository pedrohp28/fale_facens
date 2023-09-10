package com.projeto.falefacensserver.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CategoriaTest {

    private Categoria categoria;

    @BeforeEach
    public void init() {
        categoria = new Categoria();
        categoria = new Categoria(0L, "", new Contato());
        categoria.setId(0L);
        categoria.setNome("");
        categoria.setContato(new Contato());
    }

    @Test
    public void getTest() {
        categoria.getId();
        categoria.getNome();
        categoria.getContato();
        assertNotNull(categoria, "Can't be null");
    }
}
