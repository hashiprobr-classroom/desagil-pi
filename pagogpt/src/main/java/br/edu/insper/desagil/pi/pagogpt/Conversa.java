package br.edu.insper.desagil.pi.pagogpt;

import java.util.ArrayList;
import java.util.List;

public class Conversa {
    private Usuario usuario;
    private List<Prompt> prompts;

    public Conversa(Usuario usuario) {
        this.usuario = usuario;
        this.prompts = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void adiciona(Prompt prompt) {
        prompts.add(prompt);
    }

    public double calculaSubTotal() {
        double subTotal = 0;
        for (Prompt prompt : prompts) {
            subTotal += prompt.calculaPreco();
        }
        return subTotal;
    }

    public double calculaSubMedia() {
        int size = prompts.size();
        if (size == 0) {
            throw new IllegalStateException("Nenhum prompt!");
        }
        return calculaSubTotal() / size;
    }
}
