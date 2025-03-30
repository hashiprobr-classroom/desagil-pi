package br.edu.insper.desagil.pi.autumn;

import java.util.List;

public class FTPServer extends Server {
    public FTPServer(List<Socket> socketPool) {
        super(socketPool);
    }

    @Override
    public void broadcast() {
        for (Socket socket : getActiveSockets().values()) {
            socket.send(List.of('f', 't', 'p'));
        }
    }
}
