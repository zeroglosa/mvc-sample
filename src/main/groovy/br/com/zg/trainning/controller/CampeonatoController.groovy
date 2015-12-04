package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.view.campeonato.CampeonatoView


class CampeonatoController {

	CampeonatoView campview = new CampeonatoView()
	Campeonato campeonato
	ClubeController clubeCon = new ClubeController()

	void iniciaCampeonato(){
		campview.exibeBoasVindas()
		criaCampeonato()
	}

	void criaCampeonato(){
		campeonato = new Campeonato(nome: "${campview.solicitaNomeCampeonato()}")
		clubeCon.adicionaClubes(campeonato)
	}












}
