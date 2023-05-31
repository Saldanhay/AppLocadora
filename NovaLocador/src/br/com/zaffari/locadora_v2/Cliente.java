package br.com.zaffari.locadora_v2;

public class Cliente {
	private String CPF;
	private String Nome;
	private StatusEnum Status;

	Cliente(String cpf, String nome) {
		this.CPF = cpf;
		this.Nome = nome;
	}

	enum StatusEnum {
		ATIVO, INATIVO, BLOQUEADO
	}

	public String getCPF() {
		return CPF;
	}

	public String GetNome() {
		return Nome;
	}

	public StatusEnum GetStatus() {
		return Status;
	}

	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + ", Nome=" + Nome + ", Status=" + Status + "]";
	}

}
