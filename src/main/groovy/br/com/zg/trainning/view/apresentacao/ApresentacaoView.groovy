package br.com.zg.trainning.view.apresentacao

import br.com.zg.trainning.model.Clube

/**
 * Created by Lucas Oliveira on 03/12/2015.
 */
class ApresentacaoView implements EntradaDadosApresentacao {

    Scanner entrada = new Scanner(System.in)

    @Override
    String exibeMenu() {

        println """Selecione uma operação

[1] Saber o campeão

[2] Saber o lanterna

[3] Exibir tabela

[0] Encerrar

Opção:
"""
        return entrada.nextLine()

    }
    void exibeDadosTime(Clube clube){
        println "Nome:  ${clube.nome}"
        println "Vitórias:  ${clube.vitorias}"
        println "Saldo Gols:  ${clube.saldo}"
    }
}
