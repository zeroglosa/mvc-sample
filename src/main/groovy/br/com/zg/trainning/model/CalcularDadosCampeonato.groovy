package br.com.zg.trainning.model


class CalcularDadosCampeonato implements CalcularDados {


	Clube retorneCampeao(Campeonato campeonato){
		List<Clube> clubes = ordenaListaClubes(campeonato)
		return clubes.first()

	}

	Clube retorneUltimoColocado(Campeonato campeonato){
		List<Clube> clubes = ordenaListaClubes(campeonato)
		return clubes.last()

	}

	List<Clube> ordenaListaClubes(Campeonato campeonato){
		List<Clube> clubes = campeonato.clubesParticipantes
		Collections.sort(clubes,this)

		clubes.reverse()
	}
	int compare(Clube clube1, Clube clube2){
		int pontuacaoClube1 = calculePontuacao(clube1)
		int pontuacaoClube2 = calculePontuacao(clube2)

		int compareTimes = pontuacaoClube1 <=> pontuacaoClube2

		if(compareTimes==0){
			compareTimes = compareEmpate(clube1,clube2)
		}
		return compareTimes
	}

	int calculePontuacao(Clube clube){
		 return clube.vitorias * 3 + clube.empates
	}

	int compareEmpate(Clube clube1, Clube clube2){
		int vitoriasClube1 = clube1.vitorias
		int vitoriasClube2 = clube2.vitorias

		return vitoriasClube1 <=> vitoriasClube2
	}




}
