package br.com.zg.trainning.view

class ClubeView implements EntradaDadosClube{

	Scanner entrada = new Scanner(System.in)

	@Override
	String solicitaNomeClube() {
		print "Insira o nome do clube: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroVitorias() {
		print "Insira o número de vitórias: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroEmpates() {
		print "Insira o número de empates: "
		return entrada.nextLine()

	}

	@Override
	String solicitaNumeroDerrotas() {
		print "Insira o número de derrotas: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroGolsPro() {
		print "Insira o número de Gols Pró: "
		return entrada.nextLine()
	}

	@Override
	String solicitaNumeroGolsContra() {
		print "Insira o número de Gols Contra: "
		return entrada.nextLine()
	}
}
