package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PromptPagoTest {
    private PromptPago p;

    @BeforeEach
    void setUp() {
        p = new PromptPago("pergunta", 0.1);
    }

    @Test
    void constroi() {
        assertEquals("pergunta", p.getPergunta());
        assertNull(p.getResposta());
    }

    @Test
    void mudaResposta() {
        p.setResposta("resposta");
        assertEquals("resposta", p.getResposta());
    }

    @Test
    void preco() {
        assertEquals(0.8, p.calculaPreco(), 0.01);
    }
}
