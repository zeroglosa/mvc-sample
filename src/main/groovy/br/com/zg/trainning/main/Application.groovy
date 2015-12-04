package br.com.zg.trainning.main

import br.com.zg.trainning.controller.CampeonatoController
import br.com.zg.trainning.controller.ClubeController
import br.com.zg.trainning.model.CalcularDadosCampeonato
import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Clube


class Application {


	public static void main(String[] args){
//		ClubeController teste = new ClubeController()
//		Campeonato brasileirao = new Campeonato()
//		teste.adicionaClubes(brasileirao)
//		teste.adicionaClubes(brasileirao)
//		CalcularDadosCampeonato estatisticas = new CalcularDadosCampeonato()
//		Clube campeao = estatisticas.retorneCampeao(brasileirao)
//		println campeao?.nome

		CampeonatoController campeonato = new CampeonatoController()
		campeonato.iniciaCampeonato()
	}

}
