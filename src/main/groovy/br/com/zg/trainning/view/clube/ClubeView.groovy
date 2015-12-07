package br.com.zg.trainning.view.clube

import br.com.zg.trainning.controller.CampeonatoController
import br.com.zg.trainning.view.campeonato.CampeonatoView

import static br.com.zg.trainning.controller.CampeonatoController.entrada


class ClubeView implements EntradaDadosClube{


	@Override
	String solicitaNomeClube() {
		print "Insira o nome do clube: "
		entrada.nextLine()
	}

	@Override
	String solicitaNumeroVitorias() {
		print "Insira o número de vitórias: "
		entrada.nextLine()
	}

	@Override
	String solicitaNumeroEmpates() {
		print "Insira o número de empates: "
		entrada.nextLine()

	}

	@Override
	String solicitaNumeroDerrotas() {
		print "Insira o número de derrotas: "
		entrada.nextLine()
	}

	@Override
	String solicitaNumeroGolsPro() {
		print "Insira o número de Gols Pró: "
		entrada.nextLine()
	}

	@Override
	String solicitaNumeroGolsContra() {
		print "Insira o número de Gols Contra: "
		entrada.nextLine()
	}

	@Override
	String verificaFimInclusao() {
		print "Deseja incluir outro clube? (S/N): "
		entrada.nextLine()
	}
	void retorneCaracterInvalido(){
		println "Caracter invalido, digite somente s ou n"
	}


}
