package com.projeto.falefacensserver.repositoy;

import com.projeto.falefacensserver.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ContatoRepositoy extends JpaRepository<Contato, Long> {

    @Query(value = "SELECT u FROM Contato u WHERE nome = :nome")
    Optional<Contato> findyByNome(@Param("nome") String nome);

    @Query(value = "SELECT u FROM Contato u WHERE email = :email")
    Optional<Contato> findyByEmail(@Param("email") String email);

    @Query(value = "SELECT u FROM Contato u WHERE telefone = :telefone")
    Optional<Contato> findyByTelefone(@Param("telefone") String telefone);
}
