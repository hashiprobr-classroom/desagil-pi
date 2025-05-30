package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class Historico {
    private Tutor tutor;
    private String nome;
    private int tipo;
    private LocalDate dataNascimento;
    private double peso;
    private String extra;

    public Historico(String nomeTutor, String nome, int tipo, LocalDate dataNascimento, double peso, String extra) {
        this.tutor = new Tutor(nomeTutor);
        this.nome = nome;
        this.tipo = tipo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.extra = extra;
    }

    public void setEnderecoTutor(String enderecoTutor) {
        tutor.setEndereco(enderecoTutor);
    }

    public void setTelefoneTutor(String telefoneTutor) {
        tutor.setTelefone(telefoneTutor);
    }

    public String resumoTutor() {
        return tutor.resumo();
    }

    public String resumo() {
        String summary = "Animal:" + nome + "\n";
        summary += "Nascimento: " + dataNascimento.toString() + "\n";
        summary += "Peso: " + peso + "kg\n";
        summary += resumoEspecifico();
        return summary;
    }

    public String resumoEspecifico() {
        if (tipo == 0) {
            return "Banho: " + extra + "\n";
        }
        if (tipo == 1) {
            return "Doença: " + extra + "\n";
        }
        if (tipo == 2) {
            return "Venenosa: " + Boolean.parseBoolean(extra) + "\n";
        }
        if (tipo == 3) {
            return "Comida: " + Integer.parseInt(extra) + "\n";
        }
        return "";
    }
}
