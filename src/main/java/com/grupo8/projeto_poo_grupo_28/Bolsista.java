package com.grupo8.projeto_poo_grupo_28;

public class Bolsista extends Aluno  {
    //@Override:  forma de garantir que você está sobrescrevendo um método e não criando um novo
    @Override
    public void pagarMensalidade(){
        System.out.println("O aluno" + this.getNome() + "é bolsista, por isso não ha de pagar mensalidade");
    }
}
