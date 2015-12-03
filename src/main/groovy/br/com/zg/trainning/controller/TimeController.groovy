package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Time
import br.com.zg.trainning.view.TimeView
import br.com.zg.trainning.view.console.TimeConsoleView

class TimeController {
    TimeView timeView

    TimeController() {
        timeView = new TimeConsoleView()
    }

    void adicioneTimes(Campeonato campeonato) {
        timeView.notifiqueAdicaoDeTimes()
        adicioneTime(campeonato)
    }

    private void adicioneTime(Campeonato campeonato) {
        String nome = timeView.pergunteNomeTime()
        int vitorias = timeView.pergunteNumeroDeVitorias().toInteger()
        int empates = timeView.pergunteNumeroDeEmpates().toInteger()
        int derrotas = timeView.pergunteNumeroDeDerrotas().toInteger()
        int golsPro = timeView.pergunteNumeroDeGolsPro().toInteger()
        int golsContra = timeView.pergunteNumeroDeGolsContra().toInteger()

        Time time = new Time(
                nome: nome,
                vitorias: vitorias,
                empates: empates,
                derrotas: derrotas,
                golsPro: golsPro,
                golsContra: golsContra
        )

        campeonato.adicioneTime(time)

        String maisTimes = timeView.pergunteSeMaisTimes()

        if (maisTimes == 'S') {
            adicioneTime(campeonato)
        }
    }
}
