package com.grupo8.projeto_poo_grupo_28;

public class Professor extends Pessoa {
	private String centro;

	public void darAula() {
		System.out.println("O professor" + this.getNome() + "esta dando aula." + this.centro);
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}
}
