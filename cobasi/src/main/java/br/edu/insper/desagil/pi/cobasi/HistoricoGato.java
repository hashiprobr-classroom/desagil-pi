package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class HistoricoGato extends Historico {
    public HistoricoGato(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String doenca) {
        super(nomeTutor, nome, 1, dataNascimento, peso, doenca);
    }

    @Override
    public String resumoEspecifico() {
        return "Doença: " + extra + "\n";
    }
}
