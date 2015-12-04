package br.com.zg.trainning.controller

import br.com.zg.trainning.model.CalculadorResultados
import br.com.zg.trainning.model.CalculadorResultadosPontosCorridos
import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Time
import br.com.zg.trainning.view.CampeonatoView
import br.com.zg.trainning.view.console.CampeonatoConsoleView

class CampeonatoController {
    public static final int SABER_CAMPEAO = 1
    public static final int SABER_LANTERNA = 2
    public static final int EXIBIR_TABELA = 3
    public static final int ENCERRAR = 0

    private TimeController timeController
    private CampeonatoView campeonatoView
    private CalculadorResultados calculadorResultados

    CampeonatoController() {
        campeonatoView = new CampeonatoConsoleView()
        timeController = new TimeController()
        calculadorResultados = new CalculadorResultadosPontosCorridos()
    }

    void inicieCampeonato() {
        campeonatoView.exibaBoasVindas()
        Campeonato campeonato = crieCampeonato()
        pergunteOperacao(campeonato)
    }

    private void pergunteOperacao(Campeonato campeonato) {
        int operacao = campeonatoView.pergunteOperacao().toInteger()

        switch (operacao) {
            case SABER_CAMPEAO:
                Time campeao = calculadorResultados.obtenhaCampeao(campeonato)
                campeonatoView.exibaCampeao(campeao)

                pergunteOperacao(campeonato)
                break
            case SABER_LANTERNA:
                Time lanterna = calculadorResultados.obtenhaLanterna(campeonato)
                campeonatoView.exibaLanterna(lanterna)

                pergunteOperacao(campeonato)
                break
            case EXIBIR_TABELA:
                List<Time> times = calculadorResultados.obtenhaListaOrdenada(campeonato)
                campeonatoView.exibaTabela(times)

                pergunteOperacao(campeonato)
                break
            case ENCERRAR:
                break
        }
    }

    private Campeonato crieCampeonato() {
        String nome = campeonatoView.pergunteNomeCampeonato()
        Campeonato campeonato = new Campeonato(nome: nome)

        timeController.adicioneTimes(campeonato)

        campeonato
    }
}