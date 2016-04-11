package br.com.zg.trainning.model

class CalculadorResultadosPontosCorridos2015 implements CalculadorResultados {

    Time obtenhaCampeao(Campeonato campeonato) {
        obtenhaListaOrdenada(campeonato).first()
    }

    Time obtenhaLanterna(Campeonato campeonato) {
        obtenhaListaOrdenada(campeonato).last()
    }

    List<Time> obtenhaListaOrdenada(Campeonato campeonato) {
        List<Time> times = campeonato.times
        Collections.sort(times, this)

        times.reverse()
    }

    int compare(Time time1, Time time2) {
        int pontosTime1 = calculePontos(time1)
        int pontosTime2 = calculePontos(time2)

        int compareTimes = pontosTime1 <=> pontosTime2

        //TODO: tratar casos de empate separadamente, para aplicar o Open Closed Principle
        if (compareTimes == 0) {
            int saldoTime1 = time1.saldoDeGols
            int saldoTime2 = time2.saldoDeGols

            compareTimes = saldoTime1 <=> saldoTime2
        }

        return compareTimes
    }

    int calculePontos(Time time) {
        return time.vitorias * 3 + time.empates * 1
    }
}