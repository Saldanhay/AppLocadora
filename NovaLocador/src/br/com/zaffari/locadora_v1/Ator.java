package br.com.zaffari.locadora_v1;

import java.util.ArrayList;

public class Ator {

	private String nome;
	private String nascimento;
	private String pais;
	private String personagem;

	Ator(String nome, String nascimento, String pais, String personagem) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.pais = pais;
		this.personagem = personagem;
	}

	public String getNome() {
		return nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public String getPais() {
		return pais;
	}

	// private ArrayList<Ator> ator = new ArrayList<Ator>();

	public String getPersonagem() {
		return personagem;
	}

	@Override
	public String toString() {
		return "Ator [nome=" + nome + ", nascimento=" + nascimento + ", pais=" + pais + ", personagem=" + personagem
				+ "]";
	}
}
