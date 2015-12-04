package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Clube
import br.com.zg.trainning.view.clube.ClubeView

class ClubeController {

	ClubeView cview = new ClubeView()
	ApresentacaoController apreCon = new ApresentacaoController()


	void adicionaClubes(Campeonato campeonato){

		String nome = cview.solicitaNomeClube()
		int vitorias = cview.solicitaNumeroVitorias().toInteger()
		int derrotas = cview.solicitaNumeroDerrotas().toInteger()
		int empates = cview.solicitaNumeroEmpates().toInteger()
		int golsPro = cview.solicitaNumeroGolsPro().toInteger()
		int golsContra = cview.solicitaNumeroGolsContra().toInteger()

	Clube time = new Clube(
			nome: nome,
			vitorias: vitorias,
			derrotas: derrotas,
			empates: empates,
			golsPro: golsPro,
			golsContra: golsContra)


		campeonato.adicionaClubes(time)
		String continuacao = cview.verificaFimInclusao()
		if(continuacao.equalsIgnoreCase("s")||continuacao.equalsIgnoreCase("n")){
			if(continuacao.equalsIgnoreCase("s")){
				adicionaClubes(campeonato)
			}
			else{

				apreCon.exibeMenu(campeonato)
			}
		}
		else{
			println "Caracter invalido, digite somente s ou n"
			cview.verificaFimInclusao()
		}


	}




}
