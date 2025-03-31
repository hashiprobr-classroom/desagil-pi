package br.edu.insper.desagil.pi.pagogpt;

public class PromptGratuito extends Prompt {
    private int limite;

    public PromptGratuito(String pergunta, int limite) {
        super(pergunta);
        this.limite = limite;
    }

    @Override
    public double calculaPreco() {
        int length = getPergunta().length();
        if (length < limite) {
            return 0;
        }
        return length;
    }
}
