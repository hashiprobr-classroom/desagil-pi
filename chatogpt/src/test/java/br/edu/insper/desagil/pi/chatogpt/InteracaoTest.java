package br.edu.insper.desagil.pi.chatogpt;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InteracaoTest {
	private Interacao i;

	@BeforeEach
	void setUp() {
		i = new Interacao();
	}

	@Test
	void respondeSemPergunta() {
		Exception exception = assertThrows(IllegalStateException.class, () -> {
			i.responde("resposta à pergunta");
		});
		assertEquals("Não fez pergunta", exception.getMessage());
	}

	@Test
	void respondeComPergunta() {
		i.setPergunta("alguma pergunta");
		assertDoesNotThrow(() -> {
			i.responde("resposta à pergunta");
		});
	}

	@Test
	void calculaSemPergunta() {
		assertEquals(0, i.calcula());
	}

	@Test
	void calculaSemResposta() {
		i.setPergunta("alguma pergunta");
		assertEquals(0, i.calcula());
	}

	@Test
	void calcula() {
		i.setPergunta("alguma pergunta");
		i.responde("resposta à pergunta");
		assertEquals(34, i.calcula());
	}
}
