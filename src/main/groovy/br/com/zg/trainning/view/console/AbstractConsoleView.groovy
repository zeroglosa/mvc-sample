package br.com.zg.trainning.view.console

class AbstractConsoleView {
    static Scanner scanner = new Scanner(System.in)

    protected static String pergunte(String pergunta, String padrao = null) {
        print "$pergunta ${padrao ? "[$padrao]" : ''} "
        String resposta = scanner.nextLine() ?: padrao
        println ''
        return resposta
    }

}
