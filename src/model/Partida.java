package model;

public class Partida {
	public int Id;
	public int IdTimeCasa;
	public int GolsCasa;
	public int IdTimeVisitante;
	public int GolsVisitante;
	public int CampeonatoId;
	public double Valor;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getIdTimeCasa() {
		return IdTimeCasa;
	}
	public void setIdTimeCasa(int idTimeCasa) {
		IdTimeCasa = idTimeCasa;
	}
	public int getGolsCasa() {
		return GolsCasa;
	}
	public void setGolsCasa(int golsCasa) {
		GolsCasa = golsCasa;
	}
	public int getIdTimeVisitante() {
		return IdTimeVisitante;
	}
	public void setIdTimeVisitante(int idTimeVisitante) {
		IdTimeVisitante = idTimeVisitante;
	}
	public int getGolsVisitante() {
		return GolsVisitante;
	}
	public void setGolsVisitante(int golsVisitante) {
		GolsVisitante = golsVisitante;
	}
	public int getCampeonatoId() {
		return CampeonatoId;
	}
	public void setCampeonatoId(int campeonatoId) {
		CampeonatoId = campeonatoId;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		Valor = valor;
	}
}
