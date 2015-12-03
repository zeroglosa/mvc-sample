package br.com.zg.trainning

//import br.com.zg.trainning.controller.CampeonatoController
import spock.lang.Specification

class CampeonatoAppSpec extends Specification {

    void 'Aplicativo deve retornar o campeao do campeonato'() {
        setup:
        System.in = input

        when:
        // CampeonatoController controller = new CampeonatoController()
        // controller.inicieCampeonato()

        then:
        // System.ou. // lastLine Corinthias

        where:
        input = this.class.getResourceAsStream('/input1.txt')
    }
}
