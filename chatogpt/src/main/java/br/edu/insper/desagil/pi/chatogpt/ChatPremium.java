package br.edu.insper.desagil.pi.chatogpt;

import java.util.List;

public class ChatPremium extends Chat {
	public ChatPremium(List<Interacao> interacoes) {
		super(interacoes);
	}

	@Override
	public int calculaTotal() {
		int s = 0;
		for (Interacao interacao : getInteracoes()) {
			s += interacao.calcula();
		}
		return s;
	}
}
