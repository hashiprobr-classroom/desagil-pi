package br.edu.insper.desagil.pi.autumn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Server {
    private List<Socket> pool;
    private Map<Integer, Socket> active;

    public Server(List<Socket> pool) {
        this.pool = pool;
        this.active = new HashMap<>();
    }

    public Map<Integer, Socket> getActive() {
        return active;
    }

    public void accept() {
        Socket socket = pool.remove(0);
        active.put(socket.getPort(), socket);
    }

    public abstract void broadcast();
}
