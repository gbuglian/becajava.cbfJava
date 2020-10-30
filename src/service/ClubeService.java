package service;

import model.Clube;
import repository.ClubeRepository;

public class ClubeService {
	
	public Clube getClube(int indice) {
		ClubeRepository clubeRepository = new ClubeRepository();
		return clubeRepository.getClube(indice);
	}
	
	public void setClube(Clube clube) {
		ClubeRepository clubeRepository = new ClubeRepository();
		clubeRepository.setClube();
	}	
}
