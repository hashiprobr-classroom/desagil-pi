package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class History {
    String name;
    private String address;
    private String phone;
    private String name2;
    private int type;
    private LocalDate birth;
    private double weight;
    private String info;

    public History(String name, String name2, int type, LocalDate birth, double weight, String info) {
        this.name = name;
        this.address = null;
        this.phone = null;
        this.name2 = name2;
        this.type = type;
        this.birth = birth;
        this.weight = weight;
        this.info = info;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String guardianSummary() {
        String summary = "Guardian: " + name + "\n";
        if (address != null) {
            summary += "Address: " + address + "\n";
        }
        if (phone != null) {
            summary += "Phone: " + phone + "\n";
        }
        return summary;
    }

    public String petSummary() {
        String summary = "";
        if (type == 0) {
            summary += "DOG HISTORY\n";
            summary += "Name: " + name2 + "\n";
            summary += "Birth: " + birth.toString() + "\n";
            summary += "Weight: " + weight + "kg\n";
            summary += "Bath: " + info + "\n";
        } else if (type == 1) {
            summary += "CAT HISTORY\n";
            summary += "Name: " + name2 + "\n";
            summary += "Birth: " + birth.toString() + "\n";
            summary += "Weight: " + weight + "kg\n";
            summary += "Disease: " + info + "\n";
        } else if (type == 2) {
            summary += "SNAKE HISTORY\n";
            summary += "Name: " + name2 + "\n";
            summary += "Birth: " + birth.toString() + "\n";
            summary += "Weight: " + weight + "kg\n";
            summary += "Poisonous: " + Boolean.parseBoolean(info) + "\n";
        } else if (type == 3) {
            summary += "ELEPHANT HISTORY\n";
            summary += "Name: " + name2 + "\n";
            summary += "Birth: " + birth.toString() + "\n";
            summary += "Weight: " + weight + "kg\n";
            summary += "Food Weight: " + Integer.parseInt(info) + "\n";
        }
        return summary;
    }
}
