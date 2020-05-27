package com.faculdade.cursos.controllers;

import com.faculdade.cursos.entities.AlunoEntity;
import com.faculdade.cursos.entities.DisciplinaEntity;
import com.faculdade.cursos.repositories.AlunoRepository;
import com.faculdade.cursos.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping
    public List<AlunoEntity> get(){
        return alunoRepository.findAll();
    }


}
