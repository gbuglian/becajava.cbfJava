package model;

public class Jogador {
	public int Id;
	public String NomeJogador;
	public int Idade;
	public int PosicaoId;
	public int ClubeId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return NomeJogador;
	}
	public void setNome(String nome) {
		NomeJogador = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public int getPosicaoId() {
		return PosicaoId;
	}
	public void setPosicaoId(int posicaoId) {
		PosicaoId = posicaoId;
	}
	public int getClubeId() {
		return ClubeId;
	}
	public void setClubeId(int clubeId) {
		ClubeId = clubeId;
	}
}
