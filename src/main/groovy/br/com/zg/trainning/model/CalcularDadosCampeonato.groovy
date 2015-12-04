package br.com.zg.trainning.model


class CalcularDadosCampeonato implements CalcularDados {


	Clube retorneCampeao(Campeonato campeonato){

		int pontuacaoMaxima = 0;
		int numeroVitorias = 0
		Clube campeao

		campeonato.clubesParticipantes.each {clube ->
			if(clube.pontuacao > pontuacaoMaxima){
				pontuacaoMaxima = clube.pontuacao
				numeroVitorias = clube.vitorias
				campeao = clube
			}
			if(clube.pontuacao==pontuacaoMaxima){
				if(clube.vitorias>numeroVitorias){
					campeao = clube
				}

			}
		}
		return campeao
	}

	Clube retorneUltimoColocado(Campeonato campeonato){
		int pontuacaoMinima = 1000;
		int numeroVitorias = 1000
		Clube lanterna

		campeonato.clubesParticipantes.each {clube ->
			if(clube.pontuacao < pontuacaoMinima){
				pontuacaoMinima = clube.pontuacao
				numeroVitorias = clube.vitorias
				lanterna = clube
			}
			if(clube.pontuacao==pontuacaoMinima){
				if(clube.vitorias<numeroVitorias){
					lanterna = clube
				}
			}
		}
		return lanterna

	}

	void imprimeTabela(Campeonato campeonato){
		Collections.sort(campeonato.clubesParticipantes);
		int contador = 1
		campeonato.clubesParticipantes.each{clube->
			println ("${contador} | Clube: ${clube.nome} | Pontuação: ${clube.pontuacao}")
			contador++;
		}




	}



}
