package service;

import model.Clube;
import repository.ClubeRepository;

public class ClubeService {
	
	public Clube getClube() {
		ClubeRepository clubeRepository = new ClubeRepository();
		return clubeRepository.getClube();
	}
	
	public void setClube(Clube clube) {
		ClubeRepository clubeRepository = new ClubeRepository();
		clubeRepository.setClube();
	}	
}
