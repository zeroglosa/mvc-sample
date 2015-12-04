package br.com.zg.trainning.view.console

import br.com.zg.trainning.model.Time
import br.com.zg.trainning.view.CampeonatoView

class CampeonatoConsoleView extends AbstractConsoleView implements CampeonatoView {

    String pergunteNomeCampeonato() {
        pergunte 'Qual o nome do Campeonato?'
    }

    void exibaBoasVindas() {
        println '   _____          __  __ _____  ______ ____  _   _       _______ ____  _ '
        println '  / ____|   /\\   |  \\/  |  __ \\|  ____/ __ \\| \\ | |   /\\|__   __/ __ \\| |'
        println ' | |       /  \\  | \\  / | |__) | |__ | |  | |  \\| |  /  \\  | | | |  | | |'
        println ' | |      / /\\ \\ | |\\/| |  ___/|  __|| |  | | . ` | / /\\ \\ | | | |  | | |'
        println ' | |____ / ____ \\| |  | | |    | |___| |__| | |\\  |/ ____ \\| | | |__| |_|'
        println '  \\_____/_/    \\_\\_|  |_|_|    |______\\____/|_| \\_/_/    \\_\\_|  \\____/(_)'
        println '                                                                         '
        println '                                                                         '
    }

    String pergunteOperacao() {
        println ''
        println 'Selecione uma operação'
        println '[1] Saber o campeão'
        println '[2] Saber o lanterna'
        println '[3] Exibir tabela'
        println '[0] Encerrar'

        pergunte ''
    }

    void exibaCampeao(Time time) {
        println "O campeão é o $time.nome!"
    }

    void exibaLanterna(Time time) {
        println "O lanterna é o $time.nome."
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
