package br.com.zg.trainning

import br.com.zg.trainning.controller.CampeonatoController
import spock.lang.Specification

class CampeonatoAppSpec extends Specification {

    void 'Aplicativo deve retornar o campeao do campeonato'() {
        setup:
        System.in = input
        CampeonatoController controller = new CampeonatoController()
        controller.inicieCampeonato()
        System.setIn(System.in)
        when:
        System.in = new ByteArrayInputStream('My string'.bytes)
        System.setIn(System.in)

        then:
        true

        where:
        input = this.class.getResourceAsStream('/input1.txt')
    }
}
