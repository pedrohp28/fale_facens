package com.projeto.falefacensserver.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContatoTest {

    private Contato contato;

    @BeforeEach
    public void init() {
        contato = new Contato();
        contato = new Contato(0L, "", "", "");
        contato.setId(0L);
        contato.setNome("");
        contato.setEmail("");
        contato.setTelefone("");
    }

    @Test
    public void getTest() {
        contato.getId();
        contato.getNome();
        contato.getEmail();
        contato.getTelefone();
        assertNotNull(contato, "Can't be null");
    }
}
