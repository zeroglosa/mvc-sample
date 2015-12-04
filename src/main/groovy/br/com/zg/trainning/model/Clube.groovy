package br.com.zg.trainning.model

class Clube implements Comparable<Clube> {
	String nome
	int vitorias
	int derrotas
	int empates
	int golsPro
	int golsContra

	int getPontuacao(){
		return (vitorias*3)+(empates)
	}

	int getSaldo(){
		return golsPro - golsContra
	}
	public int compareTo(Clube clube) {

		if(this.pontuacao > clube.pontuacao){
			return -1;
		}

		else if(this.pontuacao < clube.pontuacao){
			return 1;
		}

		return 0;

	}



}
