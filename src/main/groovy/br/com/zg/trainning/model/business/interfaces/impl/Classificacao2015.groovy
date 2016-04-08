package br.com.zg.trainning.model.business.interfaces.impl

import br.com.zg.trainning.model.business.interfaces.Classificacao
import br.com.zg.trainning.model.entities.Campeonato
import br.com.zg.trainning.model.entities.Time

/**
 * Created by luizhenrique on 07/04/16.
 */
class Classificacao2015 implements Classificacao {
	Map<Integer, Time> realizaClassificacao(Campeonato campeonato) {
		CalculoPontuacao2015 calculoPontuacao2015 = new CalculoPontuacao2015()
		List<Time> times = campeonato.timesParticipantes
		/*1*/ times += new Time(nome: 'Corinthans', quantidadeVitorias: 10, quantidadeEmpates: 6, quantidadeGolsPro: 20, quantidadeGolsContra: 2)
		/*5*/ times += new Time(nome: 'Botafogo', quantidadeVitorias: 5, quantidadeEmpates: 3, quantidadeGolsPro: 15, quantidadeGolsContra: 7)
		/*6*/ times += new Time(nome: 'Palmeiras', quantidadeVitorias: 5, quantidadeEmpates: 3, quantidadeGolsPro: 10, quantidadeGolsContra: 2)
		/*7*/ times += new Time(nome: 'Fluminense', quantidadeVitorias: 2, quantidadeEmpates: 3, quantidadeGolsPro: 10, quantidadeGolsContra: 2)
		/*8*/ times += new Time(nome: 'São Paulo', quantidadeVitorias: 0, quantidadeEmpates: 5, quantidadeGolsPro: 10, quantidadeGolsContra: 2)
		/*4*/ times += new Time(nome: 'Barcelona', quantidadeVitorias: 6, quantidadeEmpates: 0, quantidadeGolsPro: 12, quantidadeGolsContra: 4)
		/*3*/ times += new Time(nome: 'Flamengo', quantidadeVitorias: 6, quantidadeEmpates: 0, quantidadeGolsPro: 11, quantidadeGolsContra: 2)
		/*2*/ times += new Time(nome: 'Real Madrid', quantidadeVitorias: 7, quantidadeEmpates: 1, quantidadeGolsPro: 22, quantidadeGolsContra: 2)

		Map<Integer, Time> timesOrdenados = aplicaCriteriosDesempate(times)
		timesOrdenados.each { key, valor ->
			int pontuacao = calculoPontuacao2015.calculaPontuacaoTotal(valor)
			println("Colocação: ${key} Pontuação: ${pontuacao} Nome:${valor.nome}")
		}
	}

	Map<Integer, Time> aplicaCriteriosDesempate(List<Time> times) {
		Map<Integer, Time> listaDesempatada = [:]
		CalculoPontuacao2015 calculoPontuacao2015 = new CalculoPontuacao2015()
		int saldoGolTimeA
		int saldoGolTimeB
		times = times.sort { timeA, timeB ->
			saldoGolTimeA = timeA.quantidadeGolsPro - timeA.quantidadeGolsContra
			saldoGolTimeB = timeB.quantidadeGolsPro - timeB.quantidadeGolsContra

			if (calculoPontuacao2015.calculaPontuacaoTotal(timeA) != calculoPontuacao2015.calculaPontuacaoTotal(timeB)) {
				calculoPontuacao2015.calculaPontuacaoTotal(timeA) <=> calculoPontuacao2015.calculaPontuacaoTotal(timeB)
			} else if (timeA.quantidadeVitorias != timeB.quantidadeVitorias) {
				timeA.quantidadeVitorias <=> timeB.quantidadeVitorias
			} else if (saldoGolTimeA != saldoGolTimeB) {
				saldoGolTimeA <=> saldoGolTimeB
			} else {
				timeA.quantidadeGolsPro <=> timeB.quantidadeGolsPro
			}
		}

		Map<Integer, Time> timesOrdenados = [:]
		times.eachWithIndex { time, i ->
			println "Time:${time.nome} Pontuação:${calculoPontuacao2015.calculaPontuacaoTotal(time)}"
		}
		return timesOrdenados
	}

	public static void main(String[] args) {
		Classificacao2015 classificacao2015 = new Classificacao2015()
		List<Time> times = []
		Campeonato campeonato1 = new Campeonato()
		campeonato1.timesParticipantes = times

		classificacao2015.realizaClassificacao(campeonato1)
	}
}
