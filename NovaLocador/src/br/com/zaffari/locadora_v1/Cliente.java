package br.com.zaffari.locadora_v1;

import java.time.LocalDate;

public class Cliente {
	private String Nome;
	// tirar isso aqui de baixo
	//private LocalDate RetiradaFilme;
	private StatusEnum Status;

	enum StatusEnum {
		ATIVO, INATIVO, BLOQUEADO
	}

	// if LocalDateTime < parara sysout voce deve 5 reais por dia não pago
//Talvez precise criar um treemap para fazer o cliente, dai depois só fazer um foreach para encontrar o cliente
	// mas a duvida é como fazer para cair uma multa nele, acho que tenho que usar
	// IF
// Data da retirada e da devolução, localdate 

	Cliente(String nome, LocalDate retiradaFilme, StatusEnum status) {

		this.Nome = nome;
		this.Status = status;

	}

	public StatusEnum GetStatusEnum() {
		return Status;
	}

//	public LocalDate getRetiradaFilme() {
//		return RetiradaFilme;
//	}

	public String getNome() {
		return Nome;
	}

	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", RetiradaFilme=" +  ", Status=" + Status + "]";
	}
}
