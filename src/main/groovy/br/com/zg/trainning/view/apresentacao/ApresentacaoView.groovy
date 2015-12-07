package br.com.zg.trainning.view.apresentacao

import br.com.zg.trainning.controller.CampeonatoController
import br.com.zg.trainning.model.Clube


import static br.com.zg.trainning.controller.CampeonatoController.entrada

/**
 * Created by Lucas Oliveira on 03/12/2015.
 */
class ApresentacaoView implements EntradaDadosApresentacao {

    @Override
    String exibeMenu() {

        println """Selecione uma operacao

[1] Saber o campeao

[2] Saber o lanterna

[3] Exibir tabela

[0] Encerrar

Opcao:
"""
        entrada.nextLine()

    }
    void exibeDadosTime(Clube clube){
        println "Nome:  ${clube.nome}"
        println "Vitorias:  ${clube.vitorias}"
        println "Saldo Gols:  ${clube.saldo}"
    }
    void exibeDadosTabela(List<Clube> clubes){
        int contador = 1
        clubes.each {clube ->
            println ("${contador} | Clube: ${clube.nome}")
            contador++;
        }

    }
    void aguardaConfirmacao(){
        print("Pressione qualquer tecla para continuar...")
        entrada.nextLine()
    }

    void exibeOpcaoInvalida(){
        println "Opcao invalida, digite novamente"

    }
}
