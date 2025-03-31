package br.edu.insper.desagil.pi.pagogpt;

public abstract class Prompt {
    private String pergunta;
    private String resposta;

    public Prompt(String pergunta) {
        this.pergunta = pergunta;
        this.resposta = null;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public abstract double calculaPreco();
}
