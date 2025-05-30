package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class HistoricoCachorro extends Historico {
    public HistoricoCachorro(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String tipoBanho) {
        super(nomeTutor, nome, 0, dataNascimento, peso, tipoBanho);
    }

    @Override
    public String resumoEspecifico() {
        return "Banho: " + extra + "\n";
    }
}
