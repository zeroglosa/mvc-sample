package br.com.zg.trainning

//import br.com.zg.trainning.controller.CampeonatoController
import spock.lang.Specification

class CampeonatoAppSpec extends Specification {

    void 'Aplicativo deve retornar o campeao do campeonato'() {
        setup:
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        System.out = new PrintStream(outputStream)
        System.in = input

        when:
//        CampeonatoController controller = new CampeonatoController()
//        controller.inicieCampeonato()

        then:
        outputStream.toString().readLines().last() == "Corinthians"

        where:
        input = this.class.getResourceAsStream('/input1.txt')
    }
}
