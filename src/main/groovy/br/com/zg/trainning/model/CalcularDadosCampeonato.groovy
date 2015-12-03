package br.com.zg.trainning.model


class CalcularDadosCampeonato implements CalcularDados {


	Clube retorneCampeao(Campeonato campeonato){
		int pontuacaoMaxima = 0;
		Clube campeao


		campeonato.clubesParticipantes.each {clube ->
			if(clube.vitorias > pontuacaoMaxima){
				pontuacaoMaxima = clube.vitorias
				campeao = clube

			}
		}

		return campeao

	}

	Clube retorneUltimoColocado(Campeonato campeonato){
		int pontuacaoMinima = 0;
		Clube lanterna

		campeonato.clubesParticipantes.each {clube ->
			if(clube.vitorias < pontuacaoMinima){
				pontuacaoMinima = clube.vitorias
				lanterna = clube

			}
		}
		return lanterna
	}

}
