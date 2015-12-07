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
                apreView.aguardaConfirmacao()
                exibeMenu(campeonato)
            break;
            case '2':
                apreView.exibeDadosTime(calcDados.retorneUltimoColocado(campeonato))
                apreView.aguardaConfirmacao()
                exibeMenu(campeonato)
            break;
            case '3':
                apreView.exibeDadosTabela(calcDados.ordenaListaClubes(campeonato))
                apreView.aguardaConfirmacao()
                exibeMenu(campeonato)

            break;
            case '0':
                return
            break;
            default:
                apreView.exibeOpcaoInvalida()
                exibeMenu()
            break;
        }

    }



}
