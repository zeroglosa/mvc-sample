package br.com.zg.trainning.model

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class Campeonato {
    String nomeCampeonato
    List<Time> timesDoCampenato = []
    Regulamentacao regulamentacao

    public Time obterCampeao(){
        return regulamentacao.obterCampeao(timesDoCampenato)
    }

    public Time obterLanterna(){
        return regulamentacao.obterLanterna(timesDoCampenato)
    }

    public ArrayList<Time> obterTabela(){
        return regulamentacao.obterTabela(timesDoCampenato)
    }

    public boolean inserirTime(Time time){
        if(time.eValido()){
            timesDoCampenato.add(time)
            return true
        }
        return false
    }

}
