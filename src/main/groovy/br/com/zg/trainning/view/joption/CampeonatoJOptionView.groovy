package br.com.zg.trainning.view.joption

import br.com.zg.trainning.model.Time
import br.com.zg.trainning.view.CampeonatoView

import javax.swing.JOptionPane

class CampeonatoJOptionView extends AbstractJOptionView implements CampeonatoView {

    String pergunteNomeCampeonato() {
        pergunte 'Qual o nome do Campeonato?'
    }

    void exibaBoasVindas() {
        JOptionPane.showMessageDialog(null, '<html><h1>Aplicação de campeonato</h1></html>')
    }

    String pergunteOperacao() {
        String pergunta = ''
        pergunta += 'Selecione uma operação\n'
        pergunta += '[1] Saber o campeão\n'
        pergunta += '[2] Saber o lanterna\n'
        pergunta += '[3] Exibir tabela\n'
        pergunta += '[0] Encerrar\n'

        pergunte pergunta, '0'
    }

    void exibaCampeao(Time time) {
        JOptionPane.showMessageDialog(null, "O campeão é o $time.nome!")
    }

    void exibaLanterna(Time time) {
        JOptionPane.showMessageDialog(null, "O lanterna é o $time.nome.")
    }

    void exibaTabela(List<Time> times) {
        List linhas = [['Classificação', 'V', 'E', 'D', 'GP', 'GC', 'SG']]
        times.eachWithIndex { Time time, idx ->
            linhas.add([
                    "${idx + 1}. $time.nome",
                    time.vitorias,
                    time.empates,
                    time.derrotas,
                    time.golsPro,
                    time.golsContra,
                    time.saldoDeGols
            ])
        }

        imprimaTabela linhas
    }
}
