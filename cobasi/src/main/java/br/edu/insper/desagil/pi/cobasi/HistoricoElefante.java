package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class HistoricoElefante extends Historico {
    public HistoricoElefante(String nomeTutor, String nome, LocalDate dataNascimento, double peso, int pesoComida) {
        super(nomeTutor, nome, 3, dataNascimento, peso, Integer.toString(pesoComida));
    }

    @Override
    public String resumoEspecifico() {
        return "Comida: " + Integer.parseInt(extra) + "\n";
    }
}
