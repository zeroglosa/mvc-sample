package br.com.zg.trainning.view.apresentacao

import br.com.zg.trainning.model.Clube
import br.com.zg.trainning.view.campeonato.CampeonatoView

import static br.com.zg.trainning.view.campeonato.CampeonatoView.entrada

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
        return entrada.nextLine()

    }
    void exibeDadosTime(Clube clube){
        println "Nome:  ${clube.nome}"
        println "Vitorias:  ${clube.vitorias}"
        println "Saldo Gols:  ${clube.saldo}"
    }
    void aguardaConfirmacao(){
        print("Pressione qualquer tecla para continuar...")
        entrada.nextLine()
    }
}
