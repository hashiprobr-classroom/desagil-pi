package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CobradorTest {
    private static final double DELTA = 0.01;

    private List<Conversa> conversas;
    private Cobrador c;
    private Usuario usuario;

    @BeforeEach
    void setUp() {
        conversas = new ArrayList<>();
        c = new Cobrador(conversas);

        usuario = mock(Usuario.class);
        when(usuario.getEmail()).thenReturn("a@b.com");
    }

    @Test
    void nenhumaValida() {
        assertEquals(0, c.calculaTotal(usuario), DELTA);
    }

    @Test
    void umaValida() {
        conversas.add(criaConversa("x@y.com", 6));
        conversas.add(criaConversa("a@b.com", 5.4));
        conversas.add(criaConversa("x@y.com", 3.21));
        assertEquals(5.4, c.calculaTotal(usuario), DELTA);
    }

    @Test
    void duasValidas() {
        conversas.add(criaConversa("a@b.com", 6));
        conversas.add(criaConversa("x@y.com", 5.4));
        conversas.add(criaConversa("a@b.com", 3.21));
        assertEquals(9.21, c.calculaTotal(usuario), DELTA);
    }

    @Test
    void tresValidas() {
        conversas.add(criaConversa("a@b.com", 6));
        conversas.add(criaConversa("a@b.com", 5.4));
        conversas.add(criaConversa("a@b.com", 3.21));
        assertEquals(14.61, c.calculaTotal(usuario), DELTA);
    }

    private Conversa criaConversa(String email, double subTotal) {
        Usuario usuario = mock(Usuario.class);
        when(usuario.getEmail()).thenReturn(email);

        Conversa conversa = mock(Conversa.class);
        when(conversa.getUsuario()).thenReturn(usuario);
        when(conversa.calculaSubTotal()).thenReturn(subTotal);
        return conversa;
    }
}
