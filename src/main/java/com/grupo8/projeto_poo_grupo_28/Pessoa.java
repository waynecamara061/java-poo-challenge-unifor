package com.grupo8.projeto_poo_grupo_28;

public abstract class Pessoa {
	private String cpf;
	private String nome;
	private int idade;

	// getter
	public String getCpf() {
		return cpf;
	}

	// setter
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Explicação: operação simples de incremento. Acessa o atributo idade e soma 1
	// ao valor atual (this.idade++)
	public void fazerAniversario() {
		this.idade++;
	}
}