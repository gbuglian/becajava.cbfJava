package service;

import model.Posicao;
import repository.PosicaoRepository;

public class PosicaoService {
	
	public Posicao getPosicao(int indice) {
		PosicaoRepository repository = new PosicaoRepository();
		return repository.getPosicao(indice);
	}
	
	public void setPosicao(Posicao posicao) {
		PosicaoRepository repository = new PosicaoRepository();
		repository.SetPosicao(posicao);
	}
}
