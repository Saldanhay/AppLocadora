package br.com.zaffari.locadora_v1;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import br.com.zaffari.locadora_v1.Cliente.StatusEnum;
import br.com.zaffari.locadora_v1.Filmes.GenerosEnum;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo();	
		Scanner sc = new Scanner(System.in);
		boolean repete = false;
		System.out.println("Bem vindo a locadora");
		System.out.println("Aqui todas as opções de filmes");

		
		Filmes oMandaloriano = new Filmes("O mandaloriano", GenerosEnum.Ação, "2019");
		oMandaloriano.adicionaAtor("Pedro Pascal", new Ator("Pedro Pascal", "02/04/1975", "Chile", "Mandaloriano"));
		oMandaloriano.adicionaAtor("Gina Carano", new Ator("Gina Carano", "16/04/1982", "EUA", "Cara Dune"));
		
		oMandaloriano.adicionarCliente("Sergio Ramos", new Cliente("Sergio Ramos", LocalDate.of(2023, 04, 17), StatusEnum.ATIVO));
		
		//LocalDate RetiradaFilme = LocalDate.parse("2023, 05, 10");
		
		Filmes JohnWick4 = new Filmes("John Wick 4: Baba Yaga", GenerosEnum.Ação, "2023");
		JohnWick4.adicionaAtor("Keanu Reeves", new Ator("Keanu Reeves", "12/09/1964", "Líbano", "John Wick"));
		JohnWick4.adicionaAtor("Laurence Fishburne",new Ator("Laurence Fishburne", "30/07/1961", "EUA", "Bowery King"));
		
		JohnWick4.adicionarCliente("Darwin Nunes", new Cliente("Darwin Nunes", LocalDate.of(2023, 05, 10), StatusEnum.ATIVO));
		JohnWick4.adicionarCliente("Sergio Ramos", new Cliente("Sergio Ramos", LocalDate.of(2023, 05, 17), StatusEnum.ATIVO));
		
		Filmes MisterioNoMediterraneo = new Filmes("Mistério no Mediterrâneo", GenerosEnum.Comédia, "2019");
		MisterioNoMediterraneo.adicionaAtor("Adam Sandler", new Ator("Adam Sandler", "09/09/1966", "EUA", "Nick"));
		MisterioNoMediterraneo.adicionaAtor("Jeniffer Aniston",new Ator("Jeniffer Aniston", "11/02/1961", "EUA", "Audrey"));
		
		MisterioNoMediterraneo.adicionarCliente("Rafael Leao",new Cliente("Rafael Leão", LocalDate.of(2023 , 05, 12), StatusEnum.ATIVO));
		
		Filmes MisterioEmParis = new Filmes("Mistério em Paris", GenerosEnum.Comédia, "2023");
		MisterioEmParis.adicionaAtor("Adam Sandler", new Ator("Adam Sandler", "09/09/1966", "EUA", "Nick"));
		MisterioEmParis.adicionaAtor("Jeniffer Aniston", new Ator("Jeniffer Aniston", "11/02/1961", "EUA", "Audrey"));
		
		MisterioEmParis.adicionarCliente("João Alfredo",new Cliente("João Alfredo", LocalDate.of(2023, 05, 10), StatusEnum.ATIVO));

		Filmes ComoEuEraAntesdeVoce = new Filmes("Como eu era antes de você", GenerosEnum.Romance, "2016");
		ComoEuEraAntesdeVoce.adicionaAtor("Sam Claflin", new Ator("Sam Claflin", "27/06/1986", "EUA", "William"));
		ComoEuEraAntesdeVoce.adicionaAtor("Emilia Clarke", new Ator("Emilia Clarke", "23/10/1986", "EUA", "Louisa"));
	
		ComoEuEraAntesdeVoce.adicionarCliente("Erick axe", new Cliente("Erick Axe", LocalDate.of(2022, 12, 20), StatusEnum.BLOQUEADO));
		
		Filmes SimplesmenteAcontece = new Filmes("Simplesmente acontece", GenerosEnum.Romance, "2014");
		SimplesmenteAcontece.adicionaAtor("Sam Claflin", new Ator("Sam Claflin", "27/06/1986", "EUA", "William"));
		SimplesmenteAcontece.adicionaAtor("Lily Collins",new Ator("Lily Collins", "18/03/1989", "Reino Unido", "rosie"));
		
		SimplesmenteAcontece.adicionarCliente("Erick axe", new Cliente("Erick Axe", LocalDate.of(2022, 12, 21), StatusEnum.BLOQUEADO));

		Filmes NadaDeNovoNoFront = new Filmes("Nada de novo no front", GenerosEnum.Drama, "2022");
		NadaDeNovoNoFront.adicionaAtor("Felix Kammerer", new Ator("Felix Kammerer", "19/09/1995", "Austria", "Paul"));
		NadaDeNovoNoFront.adicionaAtor("Albrecht Schuch",new Ator("Albrecht Schuch", "21/08/1985", "Alemanha", "Katz"));
		
		NadaDeNovoNoFront.adicionarCliente("Eduardo Schineider", new Cliente("Eduardo Schineider", LocalDate.of(2023, 04, 14), StatusEnum.ATIVO));

		Filmes ABatalhaEsquecida = new Filmes("A batalha esquecida", GenerosEnum.Drama, "2020");
		ABatalhaEsquecida.adicionaAtor("Susan Radder",new Ator("Susan Radder", "20/03/1999", "Paises Baixos", "Teuntje"));
		ABatalhaEsquecida.adicionaAtor("Gigs Blom", new Ator("Gigs Blom", "02/01/1997", "Paises Baixos", "Marinus"));
		
		//ABatalhaEsquecida.adicionarCliente(null,null);

		Filmes CampoDoMedo = new Filmes("Campo do medo", GenerosEnum.Terror, "2019");
		CampoDoMedo.adicionaAtor("Will Buie", new Ator("Will Buie", "20/03/2007", "EUA", "Tobin"));
		CampoDoMedo.adicionaAtor("Harrison Gilbertson",new Ator("Harrison Gilbertson", "29/06/2003", "Australia", "Travis"));
		
		//CampoDoMedo.adicionarCliente(null, null);

		Filmes M3GAN = new Filmes("M3GAN", GenerosEnum.Terror, "2022");
		M3GAN.adicionaAtor("Amie Donald", new Ator("Amie Donald", "28/01/2010", "Nova Zelandia", "M3gan"));
		M3GAN.adicionaAtor("Jenna Davis", new Ator("Jenna Davis", "05/05/2004", "EUA", "M3gan"));
		
		M3GAN.adicionarCliente("Emily Dare", new Cliente("Emily Dare", LocalDate.of(2023, 05, 15),StatusEnum.ATIVO ));

		Filmes BladeRunner2049 = new Filmes("Blade Runner 2049", GenerosEnum.Ficção, "2017");
		BladeRunner2049.adicionaAtor("Ryan Goslin", new Ator("Ryan Gosling", "12/09/1980", "Canada", "K"));
		BladeRunner2049.adicionaAtor("Ana de Armas", new Ator("Ana de Armas", "30/04/1988", "Cuba", "Joy"));
		
		BladeRunner2049.adicionarCliente("Lara Martinez" , new Cliente("Lara Martinez", LocalDate.of(2023, 03, 29), StatusEnum.ATIVO));
		
		Filmes Duna = new Filmes("Duna", GenerosEnum.Ficção, "2021");
		Duna.adicionaAtor("Zendaya", new Ator("Zendaya", "01/09/1996", "EUA", "Chani"));
		Duna.adicionaAtor("Timothee Chalamet", new Ator("Timothee Chalamet", "22/12/1995", "EUA", "Paul"));
		
		Duna.adicionarCliente("Gessica Mayer", new Cliente("Gessica Mayer", LocalDate.of(2023, 05,22 ), StatusEnum.ATIVO));
		
		/*
		 * List menu = new ArrayList<>(); menu.add(cat1); menu.add(cat2);
		 * menu.add(cat3); menu.add(cat4); menu.add(cat5); menu.add(cat6);
		 * System.out.println(menu);
		 */
		catalogo.adicionarFilme(oMandaloriano);
		catalogo.adicionarFilme(JohnWick4);
		catalogo.adicionarFilme(MisterioNoMediterraneo);
		catalogo.adicionarFilme(MisterioEmParis);
		catalogo.adicionarFilme(ComoEuEraAntesdeVoce);
		catalogo.adicionarFilme(SimplesmenteAcontece);
		catalogo.adicionarFilme(NadaDeNovoNoFront);
		catalogo.adicionarFilme(ABatalhaEsquecida);
		catalogo.adicionarFilme(CampoDoMedo);
		catalogo.adicionarFilme(M3GAN);
		catalogo.adicionarFilme(BladeRunner2049);
		catalogo.adicionarFilme(Duna);

		//System.out.println(catalogo);

		System.out.println("Escolha o genero de filme que deseja ver");
		System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção,7 por Ano");

		do {
			String escolha = "6";
			escolha = sc.next();
			List<Filmes> resultado;
			List<String> results;
			switch (escolha) {

			case "1":

				resultado = catalogo.pesquisaFilmePorGeneroAcao();
				System.out.println(resultado);
				System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção");
				repete = true;

				break;

			case "2":
				resultado = catalogo.pesquisaFilmePorGeneroComedia();
				System.out.println(resultado);
				System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção");
				repete = true;
				break;

			case "3":
				resultado = catalogo.pesquisaFilmePorGeneroRomance();
				System.out.println(resultado);
				System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção");
				repete = true;
				break;

			case "4":
				resultado = catalogo.pesquisaFilmePorGeneroDrama();
				System.out.println(resultado);
				System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção");
				repete = true;
				break;

			case "5":
				resultado = catalogo.pesquisaFilmePorGeneroTerror();
				System.out.println(resultado);
				System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção");
				repete = true;
				break;

			case "6":
				resultado = catalogo.pesquisaFilmePorGeneroFiccao();
				System.out.println(resultado);
				System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção");
				repete = true;
				break;

			case "7":
				System.out.println("Escolha o ano");
				escolha = sc.next();
				results = catalogo.pesquisaFilmePorAno(escolha);
				System.out.println(results);
				break;

			case "8":
				System.out.println();

				break;

			default:
				System.out.println("Nenhum resultado de pesquisa encontrado!!!");
				System.out.println("Tente novamente!!!");
				System.out.println("1 Ação, 2 Comedia, 3 Romance, 4 Drama, 5 Terror, 6 Ficção");
				repete = true;
				break;
			}
		} while (repete);

//		List<String> resultado;

//		resultado = catalogo.pesquisaFilmePorGenero();
//		System.out.println(resultado);
//
//		List<String> results;
//		results = catalogo.pesquisaFilmePorAno("2017");
		// System.out.println(results);

		// 1 - etapa criar catalogo de filmes, feito

		// 2 - etapa fazer uma pesquisa pelo critério ano

	}

}
