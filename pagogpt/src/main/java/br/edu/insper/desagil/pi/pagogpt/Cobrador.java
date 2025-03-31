package br.edu.insper.desagil.pi.pagogpt;

import java.util.List;

public class Cobrador {
    private List<Conversa> conversas;

    public Cobrador(List<Conversa> conversas) {
        this.conversas = conversas;
    }

    public double calculaTotal(Usuario usuario) {
        double total = 0;
        String email = usuario.getEmail();
        for (Conversa conversa : conversas) {
            if (conversa.getUsuario().getEmail().equals(email)) {
                total += conversa.calculaSubTotal();
            }
        }
        return total;
    }
}
