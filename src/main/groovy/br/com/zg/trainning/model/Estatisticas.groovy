package br.com.zg.trainning.model

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class Estatisticas implements Comparable<Estatisticas> {
    int vitorias = 0
    int empates = 0
    int derrotas = 0
    int golsFeitos = 0
    int golsLevados = 0

    public int getSaldoGols(){
        return this.golsFeitos - this.golsLevados;
    }

    @Override
    int compareTo(Estatisticas comparado) {

        if(this.getPontuacao() > comparado.getPontuacao()) return 1
        else if(this.getPontuacao() < comparado.getPontuacao()) return -1

        if(this.vitorias > comparado.vitorias) return 1
        else if(this.vitorias < comparado.vitorias) return -1

        if(this.empates > comparado.empates) return 1
        else if(this.empates < comparado.empates) return -1

        if(this.derrotas > comparado.derrotas) return -1
        else if(this.derrotas < comparado.derrotas) return 1

        if(this.golsFeitos > comparado.golsFeitos) return 1
        else if(this.golsFeitos < comparado.golsFeitos) return -1

        if(this.golsLevados > comparado.golsLevados) return -1
        else if(this.golsLevados < comparado.golsLevados) return 1

        return 0;
    }

    private int getPontuacao(){
        return (this.vitorias * 3) + this.empates

    }

    @Override
    String toString() {
        return "$vitorias-$empates-$derrotas-$golsFeitos-$golsLevados\n"
    }
}
