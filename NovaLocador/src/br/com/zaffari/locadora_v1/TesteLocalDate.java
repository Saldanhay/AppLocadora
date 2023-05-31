package br.com.zaffari.locadora_v1;

import java.time.LocalDate;

public class TesteLocalDate {
// Aqui criar o metodo
	LocalDate RetiradaFilme = LocalDate.parse("2023, 05, 10");
	LocalDate hoje = LocalDate.now();
	
	public TesteLocalDate(){
		
	//	boolean SePassou = hoje.isAfter(RetiradaFilme));
			
			int comparaData = hoje.compareTo(RetiradaFilme);

			if (comparaData > 0) {
			  System.out.println("Você deve 5 reais");
			} else if (comparaData < 0) {
			  System.out.println("today is earlier than 4th-Jan-2022");
			} else {
			  System.out.println("both dates are equal");
			}
			
		}

	@Override
	public String toString() {
		return "PagamentoCliente [RetiradaFilme=" + RetiradaFilme + ", hoje=" + hoje + "]";
	}

	public LocalDate getRetiradaFilme() {
		return RetiradaFilme;
	}

	public void setRetiradaFilme(LocalDate retiradaFilme) {
		RetiradaFilme = retiradaFilme;
	}

	public LocalDate getHoje() {
		return hoje;
	}

	public void setHoje(LocalDate hoje) {
		this.hoje = hoje;
	}
		
	}
	

