package br.edu.insper.desagil.pi.autumn;

import java.util.List;

public class HTTPServer extends Server {
    public HTTPServer(List<Socket> pool) {
        super(pool);
    }

    @Override
    public void broadcast() {
        for (Socket socket : getActive().values()) {
            socket.send(List.of('h', 't', 't', 'p'));
        }
    }
}
