package com.grupo8.projeto_poo_grupo_28;

public class Aluno extends Pessoa {
	public String matricula;

	public void pagarMensalidade() {
		System.out.println("Você deve pagar mensalidade" + this.getNome());
	}

	// Getters e Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}