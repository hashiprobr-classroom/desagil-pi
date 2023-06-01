package br.edu.insper.desagil.pi.chatogpt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Usuario u;

	@BeforeEach
	void setUp() {
		u = new Usuario("a@b.com");
	}

	private Chat criaChat(int total) {
		Chat chat = mock(Chat.class);
		when(chat.calculaTotal()).thenReturn(total);
		return chat;
	}

	@Test
	void calculaTotalDeTotais() {
		u.salva(0, criaChat(1));
		u.salva(1, criaChat(2));
		u.salva(2, criaChat(3));
		assertEquals(6, u.calculaTotalDeTotais());
	}
}
