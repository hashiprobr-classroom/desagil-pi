package br.edu.insper.desagil.pi.autumn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {
    private List<Socket> socketPool;
    private Map<Integer, Socket> activeSockets;

    public Server(List<Socket> socketPool) {
        this.socketPool = socketPool;
        this.activeSockets = new HashMap<>();
    }

    public Map<Integer, Socket> getActiveSockets() {
        return activeSockets;
    }

    public void accept() {
        Socket socket = socketPool.remove(0);
        activeSockets.put(socket.getId(), socket);
    }

    public void broadcast() {
        for (Socket socket : activeSockets.values()) {
            socket.send(List.of());
        }
    }
}
