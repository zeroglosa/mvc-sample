package br.com.zg.trainning.model

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class Campeonato {
    String nomeCampeonato
    List<Time> timesDoCampenato = []

    public Time obterCampeao(){
        return timesDoCampenato.sort()[-1];
    }

    public Time obterLanterna(){
        return timesDoCampenato.sort()[0];
    }

    public ArrayList<Time> obterTabela(){
        return timesDoCampenato.reverse();
    }

    public boolean inserirTime(Time time){
        if(time.eValido()){
            timesDoCampenato.add(time)
            return true
        }
        return false
    }

}
