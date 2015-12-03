package br.com.zg.trainning

import spock.lang.Specification

class CampeonatoAppSpec extends Specification {

    void 'Aplicativo deve retornar o campeao do campeonato quando executar operação 1'() {
        setup:
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        System.out = new PrintStream(outputStream)
        System.in = input

        when:
        println 'Executar logica do controller inicial'

        then:
        outputStream.toString().readLines().last().contains "Corinthians"

        where:
        input = this.class.getResourceAsStream('/inputComCampeao.txt')
    }

    void 'Aplicativo deve retornar o lanterna do campeonato quando executar operação 2'() {
        setup:
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        System.out = new PrintStream(outputStream)
        System.in = input

        when:
        println 'Executar logica do controller inicial'

        then:
        outputStream.toString().readLines().last().contains "Grêmio"

        where:
        input = this.class.getResourceAsStream('/inputComEmpate.txt')
    }
}
