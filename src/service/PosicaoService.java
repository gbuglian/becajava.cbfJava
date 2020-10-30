package service;

import model.Posicao;
import repository.PosicaoRepository;

public class PosicaoService {
	
	public Posicao getPosicao() {
		PosicaoRepository repository = new PosicaoRepository();
		return repository.getPosicao();
	}
	
	public void setPosicao(Posicao posicao) {
		PosicaoRepository repository = new PosicaoRepository();
		repository.SetPosicao();
	}
}
