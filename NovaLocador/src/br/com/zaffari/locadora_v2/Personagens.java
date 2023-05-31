package br.com.zaffari.locadora_v2;

public class Personagens {
	private Ator Personagem;

	Personagens(Ator personagem) {
		this.Personagem = personagem;

	}

	public Ator getPersonagem() {
		return Personagem;
	}

// na minha v1 os personagens eu passei direto pelo parametro da classe ator,
// agora estou seguindo o exemplo do Barbian, que criou uma classe personagem,
// não sei como fazer essa é a minha dúvida.
}
