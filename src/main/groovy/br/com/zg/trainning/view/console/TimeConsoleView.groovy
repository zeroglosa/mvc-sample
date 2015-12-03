package br.com.zg.trainning.view.console

import br.com.zg.trainning.view.TimeView

class TimeConsoleView extends AbstractConsoleView implements TimeView {
    String pergunteNomeTime() {
        pergunte 'Qual o nome do Time?'
    }

    String pergunteNumeroDeVitorias() {
        pergunte 'Qual o número de vitórias?', '0'
    }

    String pergunteNumeroDeEmpates() {
        pergunte 'Qual o número de empates?', '0'
    }

    String pergunteNumeroDeDerrotas() {
        pergunte 'Qual o número de derrotas?', '0'
    }

    String pergunteNumeroDeGolsPro() {
        pergunte 'Qual o número de gols pró?', '0'
    }

    String pergunteNumeroDeGolsContra() {
        pergunte 'Qual o número de gols contra?', '0'
    }

    void notifiqueAdicaoDeTimes() {
        println 'Configure os times do campeonato...'
    }

    String pergunteSeMaisTimes() {
        pergunte 'Adicionar mais um time (S/N)?', 'N'
    }
}
