package br.com.zaffari.locadora_v1;

import java.util.TreeMap;

public class Filmes {

	private String Nome;
	private GenerosEnum Genero;
	private Ator NomeAtor;
	private String Ano;
	private TreeMap<String, Ator> listaAtores = new TreeMap<String, Ator>();
	private TreeMap<String, Cliente> listaClientes = new TreeMap<String, Cliente>();

	Filmes(String nome, GenerosEnum genero, String ano) {
		this.Nome = nome;
		this.Genero = genero;
		this.Ano = ano;
	}

	enum GenerosEnum {
		Ficção, Drama, Romance, Ação, Comédia, Terror
	}

	public String getNome() {
		return Nome;
	}

	public GenerosEnum getGenero() {
		return Genero;
	}

	public Ator getNomeAtor() {
		return NomeAtor;
	}

	public String getAno() {
		return Ano;
	}

	public TreeMap<String, Ator> getListaAtores() {
		return listaAtores;
	}

	public void adicionaAtor(String chave, Ator ator) {
		listaAtores.put(chave, ator);
	}

	public TreeMap<String, Cliente> getListaClientes() {
		return listaClientes;
	}

	public void adicionarCliente(String chave, Cliente cliente) {
		listaClientes.put(chave, cliente);

	}

	public void comparaData() {

	}

	@Override
	public String toString() {
		return "Filmes [Nome=" + Nome + ", Genero=" + Genero + ", NomeAtor=" + NomeAtor + ", Ano=" + Ano
				+ ", listaAtores=" + listaAtores + ", listaClientes=" + listaClientes + "]";
	}
}
