package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Clube
import br.com.zg.trainning.view.ClubeView

class ClubeController {

	ClubeView cview = new ClubeView();


	void adicionaClubes(Campeonato campeonato){

		String nome = cview.solicitaNomeClube()
		println nome
		int vitorias = cview.solicitaNumeroVitorias().toInteger()
		println vitorias
		int derrotas = cview.solicitaNumeroDerrotas().toInteger()
		println derrotas
		int empates = cview.solicitaNumeroEmpates().toInteger()
		println empates
		int golsPro = cview.solicitaNumeroGolsPro().toInteger()
		println golsPro
		int golsContra = cview.solicitaNumeroGolsContra().toInteger()
		println golsContra


	Clube time = new Clube(
			nome: nome,
			vitorias: vitorias,
			derrotas: derrotas,
			empates: empates,
			golsPro: golsPro,
			golsContra: golsContra)


		campeonato.adicionaClubes(time)
	}


}
