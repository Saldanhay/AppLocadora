package br.com.zaffari.locadora_v1;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	private ArrayList<Filmes> filmes = new ArrayList<Filmes>();

	public void adicionarFilme(Filmes filme) {
		filmes.add(filme);
	}

	public List<Filmes> pesquisaFilmePorGeneroAcao() {

		List<Filmes> matches = new ArrayList<Filmes>();

		for (Filmes filme : filmes) {

			if (filme.getGenero() == Filmes.GenerosEnum.Ação) {
				matches.add(filme);
			}
		}
		return matches;
	}

// pesquisa por ano......

	public List<Filmes> pesquisaFilmePorGeneroComedia() {

		List<Filmes> matches = new ArrayList<Filmes>();

		for (Filmes filme : filmes) {

			if (filme.getGenero() == Filmes.GenerosEnum.Comédia) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filmes> pesquisaFilmePorGeneroRomance() {

		List<Filmes> matches = new ArrayList<Filmes>();

		for (Filmes filme : filmes) {

			if (filme.getGenero() == Filmes.GenerosEnum.Romance) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filmes> pesquisaFilmePorGeneroDrama() {

		List<Filmes> matches = new ArrayList<Filmes>();

		for (Filmes filme : filmes) {

			if (filme.getGenero() == Filmes.GenerosEnum.Drama) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filmes> pesquisaFilmePorGeneroTerror() {

		List<Filmes> matches = new ArrayList<Filmes>();

		for (Filmes filme : filmes) {

			if (filme.getGenero() == Filmes.GenerosEnum.Terror) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filmes> pesquisaFilmePorGeneroFiccao() {

		List<Filmes> matches = new ArrayList<Filmes>();

		for (Filmes filme : filmes) {

			if (filme.getGenero() == Filmes.GenerosEnum.Ficção) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<String> pesquisaFilmePorAno(String Ano) {
		List<String> pesquisa = new ArrayList<String>();

		for (Filmes filme : filmes) {
			if (filme.getAno().contains(Ano)) {
				pesquisa.add(filme.getNome());
			}
		}
		return pesquisa;

	}

	@Override
	public String toString() {
		return "Catalogo " + filmes + "]";

	}
}