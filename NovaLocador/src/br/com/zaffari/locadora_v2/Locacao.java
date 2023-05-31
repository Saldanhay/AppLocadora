package br.com.zaffari.locadora_v2;

import java.util.ArrayList;
import java.util.List;

public class Locacao {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);

}
	public List<String> pesquisaPorCPF(String CPF) {
		List<String> pesquisa = new ArrayList<String>();

		for (Cliente cliente : clientes) {
			if (cliente.getCPF().contains(CPF)) {
				pesquisa.add(cliente.GetNome());
			}
		}
		return pesquisa;

	}
	
}
