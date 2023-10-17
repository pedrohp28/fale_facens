package com.projeto.falefacensserver.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "contato")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contato {

    @Id
    @Column(name = "contato_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contato_nome", length = 200, nullable = false)
    @NotNull(message = "Name can not be blank!")
    @NotBlank(message = "Name can not be null!")
    private String nome;

    @Column(name = "email", length = 200)
    @NotNull(message = "Email can not be blank!")
    @NotBlank(message = "Email can not be null!")
    private String email;

    @Column(name = "telefone", length = 200)
    private String telefone;

    @NotNull(message = "Categoria can not be blank!")
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

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
