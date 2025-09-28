package br.edu.insper.desagil.pi.autumn;

public abstract class Client {
    private Socket socket;

    public Client() {
        this.socket = null;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public abstract void connect();
}
