package br.edu.insper.desagil.pi.chatogpt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChatPremiumTest {
	private List<Interacao> interacoes;
	private ChatPremium c;

	@BeforeEach
	void setUp() {
		interacoes = new ArrayList<>();
		c = new ChatPremium(interacoes);
	}

	private Interacao criaInteracao(int preco) {
		Interacao interacao = mock(Interacao.class);
		when(interacao.calcula()).thenReturn(preco);
		return interacao;
	}

	@Test
	void calculaTotalComZero() {
		assertEquals(0, c.calculaTotal());
	}

	@Test
	void calculaTotalComUm() {
		interacoes.add(criaInteracao(1));
		assertEquals(1, c.calculaTotal());
	}

	@Test
	void calculaTotalComDois() {
		interacoes.add(criaInteracao(1));
		interacoes.add(criaInteracao(2));
		assertEquals(3, c.calculaTotal());
	}

	@Test
	void calculaTotalComTres() {
		interacoes.add(criaInteracao(1));
		interacoes.add(criaInteracao(2));
		interacoes.add(criaInteracao(3));
		assertEquals(6, c.calculaTotal());
	}
}
