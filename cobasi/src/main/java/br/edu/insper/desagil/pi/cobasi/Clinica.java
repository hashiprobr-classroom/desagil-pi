package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<History> histories;

    public Clinic() {
        this.histories = new ArrayList<>();
    }

    public List<History> getHistories() {
        return histories;
    }

    public void addDogHistory(String guardianName, String petName, LocalDate birth, double weight, String bath) {
        histories.add(new History(guardianName, petName, 0, birth, weight, bath));
    }

    public void addCatHistory(String guardianName, String petName, LocalDate birth, double weight, String disease) {
        histories.add(new History(guardianName, petName, 1, birth, weight, disease));
    }

    public void addSnakeHistory(String guardianName, String petName, LocalDate birth, double weight, boolean poisonous) {
        histories.add(new History(guardianName, petName, 2, birth, weight, Boolean.toString(poisonous)));
    }

    public void addElephantHistory(String guardianName, String petName, LocalDate birth, double weight, int foodWeight) {
        histories.add(new History(guardianName, petName, 3, birth, weight, Integer.toString(foodWeight)));
    }
}
