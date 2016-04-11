package br.com.zg.trainning.view.joption

import javax.swing.JLabel
import javax.swing.JOptionPane

class AbstractJOptionView {

    protected static String pergunte(String pergunta, String padrao = null) {
        pergunta = "$pergunta ${padrao ? "[$padrao]" : ''} "
        String resposta = JOptionPane.showInputDialog(pergunta) ?: padrao
        return resposta
    }

    void imprimaTabela(List<List> linhas) {
        String tabela = '<html><body><table border="1">\n'

        linhas.eachWithIndex { linha, idxl ->
            tabela += '<tr>\n'
            linha.each { conteudo ->
                tabela += "<td>$conteudo</td>\n"
            }
            tabela += '</tr>\n'
        }

        tabela += '</table></body></html>'

        JOptionPane.showMessageDialog(null, new JLabel(tabela))
    }

}
