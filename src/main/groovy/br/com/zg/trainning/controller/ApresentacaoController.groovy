package br.com.zg.trainning.controller

import br.com.zg.trainning.model.CalcularDadosCampeonato
import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.view.apresentacao.ApresentacaoView

class ApresentacaoController {

    ApresentacaoView apreView = new ApresentacaoView()
    CalcularDadosCampeonato calcDados = new CalcularDadosCampeonato()



    void exibeMenu(Campeonato campeonato){
        String opcao = apreView.exibeMenu()
        switch(opcao){
            case '1':
                apreView.exibeDadosTime(calcDados.retorneCampeao(campeonato))
                exibeMenu(campeonato)
            break;
            case '2':
                apreView.exibeDadosTime(calcDados.retorneUltimoColocado(campeonato))
                exibeMenu(campeonato)
            break;
            case '3':
                calcDados.imprimeTabela(campeonato)
                exibeMenu(campeonato)

            break;
            case '0':
                return
            break;
            default:
                println "Opção inválida, digite novamente"
                exibeMenu()
            break;
        }

    }



}
