package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class HistoricoCobra extends Historico {
    public HistoricoCobra(String nomeTutor, String nome, LocalDate dataNascimento, double peso, boolean venenosa) {
        super(nomeTutor, nome, 2, dataNascimento, peso, Boolean.toString(venenosa));
    }

    @Override
    public String resumoEspecifico() {
        return "Venenosa: " + Boolean.parseBoolean(extra) + "\n";
    }
}
