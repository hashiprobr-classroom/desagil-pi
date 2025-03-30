package br.edu.insper.desagil.pi.autumn;

import java.util.List;

public class HTTPServer extends Server {
    public HTTPServer(List<Socket> socketPool) {
        super(socketPool);
    }

    @Override
    public void broadcast() {
        for (Socket socket : getActiveSockets().values()) {
            socket.send(List.of('h', 't', 't', 'p'));
        }
    }
}
