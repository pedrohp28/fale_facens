package com.projeto.falefacensserver.repositoy;

import com.projeto.falefacensserver.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
