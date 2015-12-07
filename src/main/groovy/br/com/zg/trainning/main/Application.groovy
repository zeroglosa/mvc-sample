package br.com.zg.trainning.main

import br.com.zg.trainning.controller.CampeonatoController
import br.com.zg.trainning.controller.ClubeController
import br.com.zg.trainning.model.CalcularDadosCampeonato
import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Clube


class Application {


	public static void main(String[] args){

		CampeonatoController campeonato = new CampeonatoController()
		campeonato.iniciaCampeonato()
	}

}
