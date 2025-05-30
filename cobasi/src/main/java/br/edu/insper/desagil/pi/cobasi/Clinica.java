package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Historico> historicos;

    public Clinica() {
        this.historicos = new ArrayList<>();
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void addHistoricoCachorro(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String tipoBanho) {
        historicos.add(new HistoricoCachorro(nomeTutor, nome, dataNascimento, peso, tipoBanho));
    }

    public void addHistoricoGato(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String doenca) {
        historicos.add(new HistoricoGato(nomeTutor, nome, dataNascimento, peso, doenca));
    }

    public void addHistoricoCobra(String nomeTutor, String nome, LocalDate dataNascimento, double peso, boolean venenosa) {
        historicos.add(new HistoricoCobra(nomeTutor, nome, dataNascimento, peso, venenosa));
    }

    public void addHistoricoElefante(String nomeTutor, String nome, LocalDate dataNascimento, double peso, int pesoComida) {
        historicos.add(new HistoricoElefante(nomeTutor, nome, dataNascimento, peso, pesoComida));
    }
}
