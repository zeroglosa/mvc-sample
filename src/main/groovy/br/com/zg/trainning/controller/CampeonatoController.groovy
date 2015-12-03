package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Clube
import br.com.zg.trainning.view.CampeonatoView


class CampeonatoController {

	CampeonatoView campview = new CampeonatoView()
	Campeonato campeonato

	void iniciaCampeonato(){
		campview.exibeBoasVindas()
		campeonato = new Campeonato(nome: "${campview.solicitaNomeCampeonato()}")
		println campeonato.nome

	}









}
