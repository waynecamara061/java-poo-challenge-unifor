package com.grupo8.projeto_poo_grupo_28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Diciplina {
	private String codigo;
	private String nome;
	private String semestre;

	// Getters e Setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}

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
}

@SpringBootApplication
public class ProjetoPooGrupo28Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPooGrupo28Application.class, args);
	}

}
