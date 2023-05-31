package br.com.zaffari.locadora_v2;

public class Ator {
	
	private String Nome;
	private String Nascimento;
	private String Origem;
	private String Personagem;

	Ator(String nome, String nascimento, String origem, String personagem) {

		this.Nome = nome;
		this.Nascimento = nascimento;
		this.Origem = origem;
		this.Personagem = personagem;
	}

	public String getNome() {
		return Nome;
	}

	public String getNascimento() {
		return Nascimento;
	}

	public String getOrigem() {
		return Origem;
	}

	public String getPersonagem() {
		return Personagem;
	}
	@Override
	public String toString() {
		return "Ator [Nome=" + Nome + ", Nascimento=" + Nascimento + ", Origem=" + Origem + ", Personagem=" + Personagem
				+ "]";
	}


}
