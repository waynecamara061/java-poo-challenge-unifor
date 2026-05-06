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

    // Metodos de adição, remoção e listagem dos alunos utilizando ArrayList.
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    // Aluno(Tipo) e aluno(Variável) *maiusculo e minisculo*: "uma variável do tipo
    // Aluno chamada aluno"
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos da turma" + this.codigo + ":");

        /**
         * Wayne: poderia usar if...else, por boas praticas costumo não usar else(clean
         * code - Robert Martin)
         * “Funções devem ser pequenas, fazer uma única coisa e ter o mínimo de
         * complexidade possível.”
         */
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
            return;
        }
        for (Aluno a : alunos) {
            System.out.println("- Nome: " + a.getNome() + " | Matrícula: " + a.getMatricula());
        }
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
