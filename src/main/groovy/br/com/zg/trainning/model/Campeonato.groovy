package br.com.zg.trainning.model

class Campeonato {

    String nome
    private List<Time> times = []

    Time adicioneTime(Time time) {
        times += time
        time
    }

    List<Time> getTimes(){
        return this.times
    }
}
