package br.com.zg.trainning.controller

import br.com.zg.trainning.model.Campeonato
import br.com.zg.trainning.model.Estatisticas
import br.com.zg.trainning.model.Regulamentacao2015
import br.com.zg.trainning.model.Time
import br.com.zg.trainning.view.CampeonatoView2015

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class CampeonatoController {
    Campeonato campeonato
    CampeonatoView2015 campeonatoView
    public void iniciar(){
        campeonatoView = new CampeonatoView2015()
        String nomeCampeonato = campeonatoView.lerCampeonato()
        campeonato = new Campeonato(nomeCampeonato : nomeCampeonato, regulamentacao: new Regulamentacao2015())
        adicionarTime()
        campeonatoView.exibirOpcoes()
        fluxoPrincipal()
    }

    private void fluxoPrincipal() {
        String acao = campeonatoView.lerAcao()
        if (acao.equals("1")) campeonatoView.mostrarCampeao(campeonato.obterCampeao().toString())
        else if (acao.equals("2")) campeonatoView.mostrarLanterna(campeonato.obterLanterna().toString())
        else if (acao.equals("3")) campeonatoView.mostrarTabela(campeonato.obterTabela().toString())
        else if (acao.equals("0")) return
        fluxoPrincipal()
    }

    private void adicionarTime() {
        def (String nomeTime, int vitorias, int empates, int derrotas, int golsFeitos, int golsTomados) = campeonatoView.lerTime()
        campeonato.inserirTime(new Time(
                nomeTime: nomeTime,
                estatisticas: new Estatisticas(
                        vitorias: vitorias,
                        empates: empates,
                        derrotas: derrotas,
                        golsFeitos: golsFeitos,
                        golsLevados: golsTomados)))
        String acao = campeonatoView.lerContinuar()

        if(acao.toUpperCase().equals("S")) adicionarTime()
    }

}
