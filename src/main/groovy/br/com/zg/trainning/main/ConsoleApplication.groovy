package br.com.zg.trainning.main

import br.com.zg.trainning.controller.CampeonatoController
import br.com.zg.trainning.controller.TimeController
import br.com.zg.trainning.model.CalculadorResultados
import br.com.zg.trainning.model.CalculadorResultadosPontosCorridos2015
import br.com.zg.trainning.view.CampeonatoView
import br.com.zg.trainning.view.TimeView
import br.com.zg.trainning.view.console.CampeonatoConsoleView
import br.com.zg.trainning.view.console.TimeConsoleView
import br.com.zg.trainning.view.joption.CampeonatoJOptionView
import br.com.zg.trainning.view.joption.TimeJOptionView

class ConsoleApplication {

    public static void main(String[] args) {
        TimeView timeView = new TimeConsoleView()
        TimeController timeController = new TimeController(timeView)
        CampeonatoView campeonatoView = new CampeonatoConsoleView()

        CalculadorResultados calculadorResultados = new CalculadorResultadosPontosCorridos2015()
        CampeonatoController controller = new CampeonatoController(campeonatoView, timeController, calculadorResultados)

        controller.inicieCampeonato()
    }
}
