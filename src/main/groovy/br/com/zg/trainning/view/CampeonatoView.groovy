package br.com.zg.trainning.view

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class CampeonatoView {

    public static def lerTime = { ->
        String nomeTime = lerLinha("Nome do Time")
        int vitorias = lerLinha("Vitórias").toInteger()
        int empates = lerLinha("Empates").toInteger()
        int derrotas = lerLinha("Derrotas").toInteger()
        int golsFeitos = lerLinha("Gols Feitos").toInteger()
        int golsTomados = lerLinha("Gold Sofridos").toInteger()
        return [nomeTime, vitorias, empates, derrotas, golsFeitos, golsTomados]
    }


    public static String lerCampeonato(){
        String nomeCampeonato = lerLinha("Seja bem vindo!!!\nNome do Campeonato")
        return nomeCampeonato
    }


    public static String lerAcao(){
        String acao = lerLinha("Comando")
        return acao
    }

    public static String lerContinuar(){
        String acao = lerLinha("Deseja inserir outro time (s/n) ?")
        return acao
    }
    public static void exibirOpcoes(){
        print("1 - Mostrar Campeao\n2 - Mostrar Lanterna\n3 - Mostrar Tabela\n0 - Encerrar\n")
    }

    public static void mostrarCampeao(String timeCampeao){
        println(timeCampeao);
    }

    public static void mostrarLanterna(String timeLanterna){
        println(timeLanterna);
    }

    public static void mostrarTabela(String tabela){
        println(tabela);
    }

    private static String lerLinha(String mensagem){
        print("$mensagem: ")
        return System.in.newReader().readLine();
    }
}
