package br.edu.insper.desagil.pi.chatogpt;

import java.util.List;

public class ChatBasico extends Chat {
	public ChatBasico(List<Interacao> interacoes) {
		super(interacoes);
	}

	@Override
	public int calculaTotal() {
		return 0;
	}
}
