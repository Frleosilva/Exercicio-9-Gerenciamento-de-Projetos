package com.atividade9.projetos.Repositories;

import com.atividade9.projetos.Models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}
