package br.com.zaffari.locadora_v2;

import java.util.ArrayList;
import java.util.List;

import br.com.zaffari.locadora_v2.EnumGenero.GenerosEnum;



public class CatalogoFilme {
	private ArrayList<Filme> filmes = new ArrayList<Filme>();

	public void adicionarFilme(Filme filme) {
		filmes.add(filme);
	}
	public List<Filme> pesquisaFilmePorGeneroAcao() {

		List<Filme> matches = new ArrayList<Filme>();

		for (Filme filme : filmes) {

			if (filme.getGenero() == EnumGenero.GenerosEnum.Ação) {
				matches.add(filme);
			}
		}
		return matches;
	}

// pesquisa por ano......

	public List<Filme> pesquisaFilmePorGeneroComedia() {

		List<Filme> matches = new ArrayList<Filme>();

		for (Filme filme : filmes) {

			if (filme.getGenero() == EnumGenero.GenerosEnum.Comédia) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filme> pesquisaFilmePorGeneroRomance() {

		List<Filme> matches = new ArrayList<Filme>();

		for (Filme filme : filmes) {

			if (filme.getGenero() == EnumGenero.GenerosEnum.Romance) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filme> pesquisaFilmePorGeneroDrama() {

		List<Filme> matches = new ArrayList<Filme>();

		for (Filme filme : filmes) {

			if (filme.getGenero() == GenerosEnum.Drama) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filme> pesquisaFilmePorGeneroTerror() {

		List<Filme> matches = new ArrayList<Filme>();

		for (Filme filme : filmes) {

			if (filme.getGenero() == GenerosEnum.Terror) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<Filme> pesquisaFilmePorGeneroFiccao() {

		List<Filme> matches = new ArrayList<Filme>();

		for (Filme filme : filmes) {

			if (filme.getGenero() == GenerosEnum.Ficção) {
				matches.add(filme);
			}
		}
		return matches;
	}

	public List<String> pesquisaFilmePorAno(String Ano) {
		List<String> pesquisa = new ArrayList<String>();

		for (Filme filme : filmes) {
			if (filme.getAno().contains(Ano)) {
				pesquisa.add(filme.getTitulo());
			}
		}
		return pesquisa;

	}
}
