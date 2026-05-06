package com.grupo8.projeto_poo_grupo_28;

public class Regular extends Aluno {

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando menssalidade integral do aluno regular " + this.getNome());
    }
}
