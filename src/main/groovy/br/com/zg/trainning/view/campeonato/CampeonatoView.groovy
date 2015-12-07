package br.com.zg.trainning.view.campeonato

import br.com.zg.trainning.controller.CampeonatoController
import static br.com.zg.trainning.controller.CampeonatoController.entrada


class CampeonatoView implements EntradaDadosCampeonato{




	@Override
	String solicitaNomeCampeonato() {
		print "Insira o nome do Campeonato: "
		entrada.nextLine()

	}

	@Override
	String exibeBoasVindas() {
		println """Bem vindo ao software gerenciador de campeonatos.
As regras são as seguintes:
-Vitória: 3 pontos
-Derrota: 0 pontos
-Empate: 1 ponto
-Vence quem obtiver maior número de pontos.

Critérios de Desempate
-Número de vitórias
				"""
	}


}
