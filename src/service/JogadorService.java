package service;

import model.Jogador;
import repository.JogadorRepository;

public class JogadorService {
	
	public Jogador getJogador() {
		JogadorRepository jogadorRepository = new JogadorRepository();
		return jogadorRepository.getJogador();
	}
	
	public void setJogador(Jogador jogador) {
		JogadorRepository jogadorRepository = new JogadorRepository();
		jogadorRepository.setJogador();
	}
}
