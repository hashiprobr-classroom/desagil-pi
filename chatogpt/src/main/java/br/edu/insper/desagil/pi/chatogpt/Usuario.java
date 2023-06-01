package br.edu.insper.desagil.pi.chatogpt;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
	private String email;
	private Map<Integer, Chat> chats;

	public Usuario(String email) {
		this.email = email;
		this.chats = new HashMap<>();
	}

	public String getEmail() {
		return email;
	}

	public void salva(int id, Chat chat) {
		chats.put(id, chat);
	}

	public void apaga(int id) {
		chats.remove(id);
	}

	public int calculaTotalDeTotais() {
		int s = 0;
		for (Chat chat : chats.values()) {
			s += chat.calculaTotal();
		}
		return s;
	}
}
