package br.com.zg.trainning.view

/**
 * Created by Samuel Junio on 03/12/2015.
 */
class CampeonatoView2015 implements ViewDeCampeonato {
    Scanner scanner = new Scanner(System.in)
    public def lerTime = {
        String nomeTime = lerLinha("Nome do Time")
        int vitorias = lerLinha("Vitórias").toInteger()
        int empates = lerLinha("Empates").toInteger()
        int derrotas = lerLinha("Derrotas").toInteger()
        int golsFeitos = lerLinha("Gols Feitos").toInteger()
        int golsTomados = lerLinha("Gold Sofridos").toInteger()
        return [nomeTime, vitorias, empates, derrotas, golsFeitos, golsTomados]
    }


    public String lerCampeonato(){
        String nomeCampeonato = lerLinha("Seja bem vindo!!!\nNome do Campeonato")
        return nomeCampeonato
    }


    public String lerAcao(){
        String acao = lerLinha("Comando")
        return acao
    }

    public String lerContinuar(){
        String acao = lerLinha("Deseja inserir outro time (s/n) ?")
        return acao
    }
    public void exibirOpcoes(){
        print("1 - Mostrar Campeao\n2 - Mostrar Lanterna\n3 - Mostrar Tabela\n0 - Encerrar\n")
    }

    public void mostrarCampeao(String timeCampeao){
        println(timeCampeao);
    }

    public void mostrarLanterna(String timeLanterna){
        println(timeLanterna);
    }

    public void mostrarTabela(String tabela){
        println(tabela);
    }

    private String lerLinha(String mensagem){
        print("$mensagem: ")
        return scanner.nextLine()
    }
}
