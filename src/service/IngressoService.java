package service;

import model.Ingresso;
import repository.IngressoRepository;

public class IngressoService {

	public Ingresso getIngresso() {
		IngressoRepository ingressoRepository = new IngressoRepository();
		return ingressoRepository.getIngresso();
		}
	
	public void setIngresso(Ingresso ingresso) {
		IngressoRepository ingressoRepository = new IngressoRepository();
		ingressoRepository.setIngresso();	
		}
	}

