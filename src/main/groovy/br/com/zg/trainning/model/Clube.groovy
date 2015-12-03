package br.com.zg.trainning.model

class Clube {
	String nome
	int vitorias
	int derrotas
	int empates
	int golsPro
	int golsContra

	int getSaldo(){
		return golsPro - golsContra
	}

}
