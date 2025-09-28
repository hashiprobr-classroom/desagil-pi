package br.edu.insper.desagil.pi.autumn;

public class FTPClient extends Client {
    @Override
    public void connect() {
        System.out.println("ftp");
    }

    public void transfer(String path) {
        System.out.println(path);
    }
}
