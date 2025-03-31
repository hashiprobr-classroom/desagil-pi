package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConversaTest {
    private static final double DELTA = 0.01;

    private Conversa c;

    @BeforeEach
    void setUp() {
        Usuario usuario = mock(Usuario.class);
        c = new Conversa(usuario);
    }

    @Test
    void subTotalVazio() {
        assertEquals(0, c.calculaSubTotal(), DELTA);
    }

    @Test
    void subTotal() {
        c.adiciona(criaPrompt(6));
        c.adiciona(criaPrompt(5.4));
        c.adiciona(criaPrompt(3.21));
        assertEquals(14.61, c.calculaSubTotal(), DELTA);
    }

    @Test
    void porPostVazio() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            c.calculaSubMedia();
        });
        assertEquals("Nenhum prompt!", exception.getMessage());
    }

    @Test
    void porPost() {
        c.adiciona(criaPrompt(6));
        c.adiciona(criaPrompt(5.4));
        c.adiciona(criaPrompt(3.21));
        assertEquals(4.87, c.calculaSubMedia(), DELTA);
    }

    private Prompt criaPrompt(double preco) {
        Prompt prompt = mock(Prompt.class);
        when(prompt.calculaPreco()).thenReturn(preco);
        return prompt;
    }
}
