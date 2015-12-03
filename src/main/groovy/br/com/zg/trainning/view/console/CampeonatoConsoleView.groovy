package br.com.zg.trainning.view.console

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
}
