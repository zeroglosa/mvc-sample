package br.com.zg.trainning.view.joption

import br.com.zg.trainning.view.TimeView

import javax.swing.JOptionPane

class TimeJOptionView extends AbstractJOptionView implements TimeView {
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
        JOptionPane.showMessageDialog(null,  'Configure os times do campeonato...')
    }

    String pergunteSeMaisTimes() {
        pergunte 'Adicionar mais um time (S/N)?', 'N'
    }
}
