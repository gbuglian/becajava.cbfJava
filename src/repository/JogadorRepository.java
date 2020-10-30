package repository;

import java.util.ArrayList;
import java.util.List;

import model.Jogador;

public class JogadorRepository {
	
	public List<Jogador> listJogador = new ArrayList<Jogador>();
	
	public Jogador getJogador() {
		return new Jogador();
	}
	
	public ArrayList<Jogador> getAllJogador(int indice) {
		return new ArrayList<Jogador>();
	}

	public void setJogador() {
	}
}
