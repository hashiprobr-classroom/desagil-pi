package br.edu.insper.desagil.pi.autumn;

import java.util.ArrayList;
import java.util.List;

public class Socket {
    private int port;

    public Socket(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void send(List<Character> bytes) {
        bytes.clear();
    }

    public List<Character> receive() {
        return new ArrayList<>();
    }
}
