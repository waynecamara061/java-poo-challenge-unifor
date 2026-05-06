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
        a1.setCpf("111.111.111-11");
        a1.setIdade(21);

        Regular a2 = new Regular();
        a2.setNome("Guilherme");
        a2.setMatricula("B3004");
        a2.setCpf("222.222.222-22");

        a2.setIdade(22);

        Bolsista a3 = new Bolsista();
        a3.setNome("Italo");
        a3.setMatricula("C0404");
        a3.setCpf("333.333.333-33");
        a3.setIdade(33);

        // 3. Instanciar 1 Professor
        Professor p1 = new Professor();
        p1.setNome("Lucas de Moura");
        p1.setCentro("Tecnologia");
        p1.setCpf("444.444.444-44");
        p1.setIdade(45);

        // 4. Instanciar 2 Visitantes
        Visitante v1 = new Visitante();
        v1.setNome("Vitor");
        v1.setCpf("555.555.555-55");
        v1.setIdade(30);

        Visitante v2 = new Visitante();
        v2.setNome("Emerson");
        v2.setCpf("666.666.666-66");
        v2.setIdade(25);

        // 5. Instanciar 3 Turmas
        Turma t1 = new Turma();
        t1.setCodigo("T01");

        Turma t2 = new Turma();
        t2.setCodigo("T02");

        Turma t3 = new Turma();
        t3.setCodigo("T03");

        // Configurando a Turma 1
        t1.setDisciplina(d1);
        t1.setProfessor(p1);
        t1.adicionarAluno(a1);
        t1.adicionarAluno(a3);

        // Configurando a Turma 2
        t2.setDisciplina(d2);
        t2.setProfessor(p1);
        t2.adicionarAluno(a2);

        // Configurando a Turma 3
        t3.setDisciplina(d3);
        t3.setProfessor(p1);
        t3.adicionarAluno(a1);
        t3.adicionarAluno(a2);
        t3.adicionarAluno(a3);

        System.out.println("\n========================================");
        System.out.println("   RELATÓRIO GERAL DAS TURMAS");
        System.out.println("========================================\n");

        Turma[] listaTurmas = { t1, t2, t3 };

        for (Turma t : listaTurmas) {
            System.out.println("TURMA: " + t.getCodigo());
            System.out.println("DISCIPLINA: " + t.getDisciplina().getNome());
            System.out.println("PROFESSOR: " + t.getProfessor().getNome());

            t.listarAlunos();

            System.out.println("Status de Pagamento:");
            for (Aluno aluno : t.getAlunos()) {
                aluno.pagarMensalidade();
            }
            System.out.println("----------------------------------------");
        }
        // Teste rápido do método fazerAniversario
        System.out.println("\n[Teste de Encapsulamento]");
        System.out.println("Idade original de " + v1.getNome() + ": " + v1.getIdade());
        v1.fazerAniversario();
        System.out.println("Idade após aniversário: " + v1.getIdade());
    }
}
