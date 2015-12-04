package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Estatisticas
import br.com.zg.trainning.model.Time
import br.com.zg.trainning.view.CampeonatoView


/**
 * Created by Samuel Junio on 03/12/2015.
 */
class CampeonatoController {
    Campeonato campeonato
    public void iniciar(){
        String nomeCampeonato = CampeonatoView.lerCampeonato()
        campeonato = new Campeonato(nomeCampeonato : nomeCampeonato)
        while(true){
            def (String nomeTime, int vitorias, int empates, int derrotas, int golsFeitos, int golsTomados) = CampeonatoView.lerTime()
            campeonato.inserirTime(new Time(
                    nomeTime : nomeTime,
                    estatisticas: new Estatisticas(
                            saldoVitorias : vitorias,
                            saldoEmpates : empates,
                            saldoDerrotas : derrotas,
                            saldoGolsFeitos: golsFeitos,
                            saldoGolsLevados: golsTomados)))
            String acao = CampeonatoView.lerContinuar()
            if(acao.equals("n")) break
        }




        CampeonatoView.exibirOpcoes()
        while(true){
            String acao = CampeonatoView.lerAcao()
            if(acao.equals("1")) CampeonatoView.mostrarCampeao(campeonato.obterCampeao().toString())
            else if(acao.equals("2")) CampeonatoView.mostrarLanterna(campeonato.obterLanterna().toString())
            else if(acao.equals("3")) CampeonatoView.mostrarTabela(campeonato.obterTabela().toString())
            else if(acao.equals("0")) break
        }

    }
}
