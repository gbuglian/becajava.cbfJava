package repository;

import java.util.ArrayList;
import java.util.List;

import model.Ingresso;

public class IngressoRepository {
	
	public List<Ingresso> listIngressos = new ArrayList<Ingresso>();

	public Ingresso getIngresso() {
		return new Ingresso();
	}

	public List<Ingresso> getAllIngresso(int indice){
		return new ArrayList<Ingresso>();
	}

	public void setIngresso() {
	}
}