package br.com.zg.trainning.model

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class Estatisticas implements Comparable<Estatisticas> {
    int saldoVitorias = 0
    int saldoEmpates = 0
    int saldoDerrotas = 0
    int saldoGolsFeitos = 0
    int saldoGolsLevados = 0

    public int getSaldoGols(){
        return this.saldoGolsFeitos - this.saldoGolsLevados;
    }

    @Override
    int compareTo(Estatisticas comparado) {

        if(this.saldoVitorias > comparado.saldoVitorias) return 1
        else if(this.saldoVitorias < comparado.saldoVitorias) return -1

        if(this.saldoEmpates > comparado.saldoEmpates) return 1
        else if(this.saldoEmpates < comparado.saldoEmpates) return -1

        if(this.saldoDerrotas > comparado.saldoDerrotas) return -1
        else if(this.saldoDerrotas < comparado.saldoDerrotas) return 1

        if(this.saldoGolsFeitos > comparado.saldoGolsFeitos) return 1
        else if(this.saldoGolsFeitos < comparado.saldoGolsFeitos) return -1

        if(this.saldoGolsLevados > comparado.saldoGolsLevados) return -1
        else if(this.saldoGolsLevados < comparado.saldoGolsLevados) return 1

        return 0;
    }

    @Override
    String toString() {
        return "$saldoVitorias-$saldoEmpates-$saldoDerrotas-$saldoGolsFeitos-$saldoGolsLevados\n"
    }
}
