package br.com.zg.trainning.model


interface CalcularDados extends Comparator<Clube> {

		Clube retorneCampeao(Campeonato campeonato)

		Clube retorneUltimoColocado(Campeonato campeonato)

		int calculePontuacao(Clube clube)

		List<Clube> ordenaListaClubes(Campeonato campeonato)

		int compareEmpate(Clube clube1, Clube clube2)




}