package com.faculdade.cursos.controllers;

import com.faculdade.cursos.entities.ProfessorEntity;
import com.faculdade.cursos.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping
    public List<ProfessorEntity> get(){
        ProfessorEntity p = new ProfessorEntity();
        p.setNome("primeiro professor");
        professorRepository.save(p);

        return professorRepository.findAll();
    }
}
