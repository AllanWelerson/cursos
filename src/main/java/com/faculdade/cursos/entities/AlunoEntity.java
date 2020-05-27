package com.faculdade.cursos.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
@Table(name = "aluno")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(name="aluno_disciplina", joinColumns=
            {@JoinColumn(name="aluno_id")}, inverseJoinColumns=
            {@JoinColumn(name="disciplina_id")})
    private List<DisciplinaEntity> discplinas;

    public AlunoEntity() {
    }

    public List<DisciplinaEntity> getDiscplinas() {
        return discplinas;
    }

    public void setDiscplinas(List<DisciplinaEntity> discplinas) {
        this.discplinas = discplinas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
