package com.grupo8.projeto_poo_grupo_28;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    // Construtor que inicializa a lista de alunos
    public Turma() {
        this.alunos = new ArrayList<>();
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }
}
