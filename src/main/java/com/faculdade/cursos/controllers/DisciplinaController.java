package com.faculdade.cursos.controllers;

import com.faculdade.cursos.entities.DisciplinaEntity;
import com.faculdade.cursos.entities.ProfessorEntity;
import com.faculdade.cursos.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping
    public List<DisciplinaEntity> get(){
        return disciplinaRepository.findAll();
    }
}
