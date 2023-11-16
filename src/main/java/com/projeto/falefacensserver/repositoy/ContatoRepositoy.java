package com.projeto.falefacensserver.repositoy;

import com.projeto.falefacensserver.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ContatoRepositoy extends JpaRepository<Contato, Long> {

    Optional<Contato> findyByNome(String nome);

    Optional<Contato> findyByEmail(String email);

    Optional<Contato> findyByTelefone(String telefone);
}
