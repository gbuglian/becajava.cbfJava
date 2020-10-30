package service;

import model.Torcedor;
import repository.TorcedorRepository;

public class TorcedorService {

	public Torcedor getTorcedor() {
		TorcedorRepository torcedorRepository = new TorcedorRepository();
		return torcedorRepository.getTorcedor();
	}
	
	public void setTorcedor(Torcedor torcedor) {
		TorcedorRepository torcedorRepository = new TorcedorRepository();
		torcedorRepository.setTorcedor();
	}
}
