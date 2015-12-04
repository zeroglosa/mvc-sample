package br.com.zg.trainning.view.console

class AbstractConsoleView {
    static Scanner scanner = new Scanner(System.in)

    protected static String pergunte(String pergunta, String padrao = null) {
        print "$pergunta ${padrao ? "[$padrao]" : ''} "
        String resposta = scanner.nextLine() ?: padrao
        println ''
        return resposta
    }

    void imprimaTabela(List<List> linhas) {
        Map<Integer, Integer> tamanhos = [:]

        linhas.each { linha ->
            linha.eachWithIndex { conteudo, idx ->
                def size = conteudo.toString().size()
                tamanhos[idx] = Math.max(size, tamanhos[idx] ?: 0)
            }
        }

        linhas.each { linha ->
            linha.eachWithIndex { conteudo, idx ->
                int maior = tamanhos[idx]
                int espacos = maior - conteudo.toString().size()
                print ' | ' + conteudo + (' ' * espacos)
            }
            print ' |\n'
        }
    }

}
