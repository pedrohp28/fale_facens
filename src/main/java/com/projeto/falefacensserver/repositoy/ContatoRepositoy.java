package com.projeto.falefacensserver.repositoy;

import com.projeto.falefacensserver.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ContatoRepositoy extends JpaRepository<Contato, Long> {

    Optional<Contato> findByNome(String nome);

    Optional<Contato> findByEmail(String email);

    Optional<Contato> findByTelefone(String telefone);
}
