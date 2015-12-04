package br.com.zg.trainning.view.apresentacao

import br.com.zg.trainning.model.Clube

/**
 * Created by Lucas Oliveira on 03/12/2015.
 */
class ApresentacaoView implements EntradaDadosApresentacao {

    Scanner entrada = new Scanner(System.in)

    @Override
    String exibeMenu() {

        println """Selecione uma opera��o

[1] Saber o campe�o

[2] Saber o lanterna

[3] Exibir tabela

[0] Encerrar

Op��o:
"""
        return entrada.nextLine()

    }
    void exibeDadosTime(Clube clube){
        println "Nome:  ${clube.nome}"
        println "Vit�rias:  ${clube.vitorias}"
        println "Saldo Gols:  ${clube.saldo}"
    }
    void aguardaConfirmacao(){
        print("Pressione qualquer tecla para continuar...")
        entrada.nextLine()
    }
}
