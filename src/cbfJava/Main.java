package cbfJava;

import java.util.ArrayList;

import java.util.List;

import model.Clube;
import model.Ingresso;
import model.Jogador;
import model.Partida;
import model.Posicao;
import model.Torcedor;

public class Main {

	public static void main(String[] args) {

		List<Posicao> listaPosicoes = new ArrayList<Posicao>();

		Posicao posicao = new Posicao();
		posicao.Id = 1;
		posicao.Descricao = "Atacante";
		listaPosicoes.add(posicao);

		posicao = new Posicao();
		posicao.Id = 2;
		posicao.Descricao = "Centro Avante";
		listaPosicoes.add(posicao);

		posicao = new Posicao();

		List<Clube> listClubes = new ArrayList<Clube>();

		Clube clube = new Clube();
		clube.Id = 1;
		clube.Nome = "Palmeiras";
		clube.Pontos = 15;
		listClubes.add(clube);

		clube = new Clube();
		clube.Id = 2;
		clube.Nome = "Bragantino";
		clube.Pontos = 5;
		listClubes.add(clube);

		List<Ingresso> listIngressos = new ArrayList<Ingresso>();

		Ingresso ingresso = new Ingresso();
		ingresso.PartidaId = 1;
		ingresso.TorcedorId = 1;
		listIngressos.add(ingresso);

		ingresso = new Ingresso();
		ingresso.PartidaId = 2;
		ingresso.TorcedorId = 1;
		listIngressos.add(ingresso);

		List<Jogador> listJogador = new ArrayList<Jogador>();

		Jogador jogador = new Jogador();
		jogador.Id = 1;
		jogador.NomeJogador = "Gabriel";
		jogador.Idade = 19;
		jogador.ClubeId = 1;
		jogador.PosicaoId = 1;
		listJogador.add(jogador);

		List<Partida> listPartida = new ArrayList<Partida>();

		Partida partida = new Partida();
		partida.Id = 1;
		partida.IdTimeCasa = 1;
		partida.IdTimeVisitante = 2;
		partida.GolsCasa = 0;
		partida.GolsVisitante = 0;
		partida.Valor = 150.0;

		List<Torcedor> lisTorcedor = new ArrayList<Torcedor>();

		Torcedor torcedor = new Torcedor();
		torcedor.Id = 1;
		torcedor.Nome = "Danilo";
	}
}
