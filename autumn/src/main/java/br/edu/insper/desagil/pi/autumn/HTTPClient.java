package br.edu.insper.desagil.pi.autumn;

public class HTTPClient extends Client {
    @Override
    public void connect() {
        System.out.println("http");
    }

    public void authenticate(String username, String password) {
        System.out.println(username + password);
    }
}
