package com.projeto.falefacensserver.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @Column(name = "categoria_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "categoria_nome")
    private String nome;
    @OneToOne
    @JoinColumn(name = "contato_id")
    private Contato contato;

    public Categoria() {
    }

    public Categoria(Long id, String nome, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
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

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(contato, that.contato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, contato);
    }
}
