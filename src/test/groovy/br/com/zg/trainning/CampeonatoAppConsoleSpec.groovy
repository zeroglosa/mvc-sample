package br.com.zg.trainning

import br.com.zg.trainning.controller.CampeonatoController
import spock.lang.Specification

class CampeonatoAppConsoleSpec extends Specification {

    void 'Aplicativo deve retornar o campeao do campeonato quando executar operação 1'() {
        setup:
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        System.out = new PrintStream(outputStream)
        System.in = input

        when:

        CampeonatoController controller = new CampeonatoController()
        controller.iniciaCampeonato()

        then:
        outputStream.toString().contains 'Corinthians'

        where:
        input = this.class.getResourceAsStream('/inputComCampeao.txt')
    }

    void 'Aplicativo deve retornar o lanterna do campeonato quando executar operação 2'() {
        setup:
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        System.out = new PrintStream(outputStream)
        System.in = input

        when:
        CampeonatoController controller = new CampeonatoController()
        controller.iniciaCampeonato()

        then:
        outputStream.toString().contains 'Atlético MG'

        where:
        input = this.class.getResourceAsStream('/inputComEmpate.txt')
    }
}
