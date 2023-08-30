package com.projeto.falefacensserver.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "contato")
public class Contato {
    @Id
    @Column(name = "contato_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "contato_nome",length = 200, nullable = false)
    private String nome;
    @Column(name = "email", length = 200)
    private String email;
    @Column(name = "telefone", length = 200)
    private String telefone;

    public Contato() {
    }

    public Contato(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contatos)) return false;
        return Objects.equals(id, contatos.id) && Objects.equals(nome, contatos.nome) && Objects.equals(email, contatos.email) && Objects.equals(telefone, contatos.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, telefone);
    }
}
