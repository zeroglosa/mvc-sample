package br.com.zg.trainning.view

/**
 * Created by Samuel Junio on 06/12/2015.
 */
interface ViewDeCampeonato {
    public def lerTime
    public String lerCampeonato()
    public String lerAcao()
    public String lerContinuar()
    public void exibirOpcoes()
    public void mostrarCampeao(String timeCampeao)
    public void mostrarLanterna(String timeLanterna)
    public void mostrarTabela(String tabela)
}