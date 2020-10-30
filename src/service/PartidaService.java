package service;

import model.Partida;
import repository.PartidaRepository;

public class PartidaService {

	public Partida getPartida() {
		PartidaRepository partidaRepository = new PartidaRepository();
		return partidaRepository.getPartida();
	}
	
	public void setPartida(Partida partida) {
		PartidaRepository partidaRepository = new PartidaRepository();
		partidaRepository.setPartida();
	}
}
