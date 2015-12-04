package br.com.zg.trainning.view

import br.com.zg.trainning.model.Time

interface CampeonatoView {

    String pergunteNomeCampeonato()

    void exibaBoasVindas()

    String pergunteOperacao()

    void exibaCampeao(Time time)

    void exibaLanterna(Time time)

    void exibaTabela(List<Time> times)
}
