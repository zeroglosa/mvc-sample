package br.com.zg.trainning.model

class Campeonato {
	String nome

	List <Clube> clubesParticipantes = []

	void adicionaClubes(Clube clube){
		clubesParticipantes+=clube
	}


}
