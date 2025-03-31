package br.edu.insper.desagil.pi.autumn;

import java.util.List;

public class FTPServer extends Server {
    public FTPServer(List<Socket> pool) {
        super(pool);
    }

    @Override
    public void broadcast() {
        for (Socket socket : getActive().values()) {
            socket.send(List.of('f', 't', 'p'));
        }
    }
}
