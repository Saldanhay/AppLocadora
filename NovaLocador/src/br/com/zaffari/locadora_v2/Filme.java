package br.com.zaffari.locadora_v2;

import br.com.zaffari.locadora_v2.EnumGenero.GenerosEnum;
import java.util.Map;
import java.util.TreeMap;

public class Filme {

	private String Titulo;
	private GenerosEnum Genero;
	private String NomeAtor;
	private String Ano;
	private TreeMap<String, Ator> listaAtores = new TreeMap<String, Ator>();
	private TreeMap<String, Cliente> listaClientes = new TreeMap<String, Cliente>();

	public TreeMap<String, Cliente> getListaClientes() {
		return listaClientes;
	}

	Filme(String titulo, GenerosEnum genero, String ano) {

		this.Titulo = titulo;
		this.Genero = genero;
		this.Ano = ano;

	}

	public Map<String, Ator> getTreeMap() {
		return getTreeMap();
	}
	public void adicionarCliente(String cpf, Cliente cliente) {
		listaClientes.put(cpf, cliente);

	}

	public GenerosEnum getGenero() {
		return Genero;
	}

	public String getTitulo() {
		return Titulo;
	}

	public String getNomeAtor() {
		return NomeAtor;
	}

	public String getAno() {
		return Ano;
	}
	public void adicionaAtor(String chave, Ator ator) {
		listaAtores.put(chave, ator);
	}

	

}
