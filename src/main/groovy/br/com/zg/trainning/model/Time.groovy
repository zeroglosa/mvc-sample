package br.com.zg.trainning.model

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class Time implements Comparable<Time> {
    String nomeTime
    Estatisticas estatisticas

    public boolean eValido(){
        return !nomeTime.equals(null) && !estatisticas.equals(null)
    }

    @Override
    String toString() {
        return "$nomeTime - ${estatisticas.toString()}"
    }

    @Override
    int compareTo(Time comparado) {
        return this.estatisticas.compareTo(comparado.estatisticas)
    }
}
