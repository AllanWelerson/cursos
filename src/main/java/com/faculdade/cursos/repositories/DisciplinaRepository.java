package com.faculdade.cursos.repositories;

import com.faculdade.cursos.entities.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<DisciplinaEntity, Long> {
}
