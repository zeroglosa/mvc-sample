package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.view.CampeonatoView
import br.com.zg.trainning.view.console.CampeonatoConsoleView

class CampeonatoController {
    private TimeController timeController
    private CampeonatoView campeonatoView

    CampeonatoController() {
        campeonatoView = new CampeonatoConsoleView()
        timeController = new TimeController()
    }

    Campeonato inicieCampeonato() {
        campeonatoView.exibaBoasVindas()
        crieCampeonato()
    }

    private Campeonato crieCampeonato() {
        String nome = campeonatoView.pergunteNomeCampeonato()
        Campeonato campeonato = new Campeonato(nome: nome)

        timeController.adicioneTimes(campeonato)

        campeonato
    }
}