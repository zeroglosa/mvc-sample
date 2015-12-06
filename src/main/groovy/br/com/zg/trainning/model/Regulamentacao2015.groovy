package br.com.zg.trainning.model

/**
 * Created by Samuel Junio on 06/12/2015.
 */

class Regulamentacao2015 implements Regulamentacao {
    public Time obterCampeao(List<Time> timesDoCampenato){
        return timesDoCampenato.sort().last();
    }

    public Time obterLanterna(List<Time> timesDoCampenato){
        return timesDoCampenato.sort().first();
    }

    public ArrayList<Time> obterTabela(List<Time> timesDoCampenato){
        return timesDoCampenato.sort().reverse();
    }
}
