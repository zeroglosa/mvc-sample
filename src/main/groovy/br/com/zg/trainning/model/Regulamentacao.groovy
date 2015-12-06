package br.com.zg.trainning.model

/**
 * Created by Samuel Junio on 06/12/2015.
 */
interface Regulamentacao {
    public Time obterCampeao(List<Time> timesDoCampenato)
    public Time obterLanterna(List<Time> timesDoCampenato)
    public ArrayList<Time> obterTabela(List<Time> timesDoCampenato)
}