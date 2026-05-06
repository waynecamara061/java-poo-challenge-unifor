package com.grupo8.projeto_poo_grupo_28;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciar 3 Disciplinas
        Disciplina d1 = new Disciplina();
        d1.setNome("POO");
        d1.setCodigo("101");
        d1.setSemestre("1");

        Disciplina d2 = new Disciplina();
        d2.setCodigo("202");
        d2.setNome("Estrutura de dados");
        d2.setSemestre("2");

        Disciplina d3 = new Disciplina();
        d3.setNome("Bancoo de dados");
        d3.setCodigo("303");
        d3.setSemestre("3");

        // 2. Instanciar 3 Alunos (2 regulares e 1 bolsista)
        Regular a1 = new Regular();
        a1.setNome("Wayne Camara");
        a1.setMatricula("A2802");

        Regular a2 = new Regular();
        a2.setNome("Guilherme");
        a2.setMatricula("B3004");

        Bolsista a3 = new Bolsista();
        a3.setNome("Italo");
        a3.setMatricula("C0404");

        // 3. Instanciar 1 Professor
        Professor p1 = new Professor();
        p1.setNome("Lucas de Moura");
        p1.setCentro("Tecnologia");

        // 4. Instanciar 2 Visitantes
        Visitante v1 = new Visitante();
        v1.setNome("Vitor");

        Visitante v2 = new Visitante();
        v2.setNome("Emerson");

        // 5. Instanciar 3 Turmas
        Turma t1 = new Turma();
        t1.setCodigo("T01");

        Turma t2 = new Turma();
        t2.setCodigo("T02");

        Turma t3 = new Turma();
        t3.setCodigo("T03");

        System.out.println("Objetos instanciados com sucesso!");
    }
}
