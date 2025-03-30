package br.edu.insper.desagil.pi.autumn;

import java.util.ArrayList;
import java.util.List;

public class Socket {
    private int id;

    public Socket(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void send(List<Character> bytes) {
        bytes.clear();
    }

    public List<Character> receive() {
        return new ArrayList<>();
    }
}
