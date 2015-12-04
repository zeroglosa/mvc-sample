package br.com.zg.trainning.model

interface CalculadorResultados extends Comparator<Time> {
    Time obtenhaCampeao(Campeonato campeonato)

    Time obtenhaLanterna(Campeonato campeonato)

    List<Time> obtenhaListaOrdenada(Campeonato campeonato)
}