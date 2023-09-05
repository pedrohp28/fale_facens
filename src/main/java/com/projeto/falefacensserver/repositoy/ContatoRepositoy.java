package com.projeto.falefacensserver.repositoy;

import com.projeto.falefacensserver.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepositoy extends JpaRepository<Contato, Long> {
}
