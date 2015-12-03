package br.com.zg.trainning.view


class CampeonatoView implements EntradaDadosCampeonato{

	Scanner entrada = new Scanner(System.in)


	@Override
	String solicitaNomeCampeonato() {
		print "Insira o nome do Campeonato: "
		return entrada.nextLine()

	}

	@Override
	String exibeBoasVindas() {
		println """Bem vindo ao software gerenciador de campeonatos.
As regras são as seguintes:
Vitória: 3 pontos
Derrota: 0 pontos
Empate: 1 ponto
Vence quem obtiver maior número de pontos.

Critérios de Desempate

				"""
	}
}
