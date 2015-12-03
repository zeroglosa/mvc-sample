# Exercício de prática MVC

## Escopo
Implementar uma aplicação que calcule o resultado de um campeonato de pontos corridos aplicando o padrão MVC sem o uso de frameworks.

## Requisitos
O aplicativo deve possuir uma interface via linha de comando que permite a inserção dos dados do campeonato e dos times que participam. Ao iniciar, ela deve dar uma boas vindas ao usuário e pedir o nome do campeonato. Em seguida pedir os dados dos times. Nome, Número de Vitorias, Número de empates, Número de Derrotas, Número de Gols Pró e Número de Gols Contra.

O regulamento de pontos do campeonato a ser aplicado está descrito em:  [Campeonato Brasileiro 2015](https://pt.wikipedia.org/wiki/Campeonato_Brasileiro_de_Futebol_de_2015_-_S%C3%A9rie_A)

_Porém é importante lembrar que o regulamento é algo mutável podendo variar de ano para ano. Então essa alteração deve ser de fácil implementação sem impactar tanto o funcionamento do sistema._

Exemplo de entrada:
> Seja bem vindo
>
> Qual o nome do campeonato: _Campeonato Brasileiro 2015 Serie A_
>
> Insira a lista de times...
>
> Qual o nome do time? _Conrinthians_
>
> Qual o numero de vitorias? _24_
>
> Qual o numero de empates? _8_
>
> Qual o numero de derrotas? _5_
>
> Qual o numero de gols pro? _70_
>
> Qual o numero de gols contra? _30_
>
> Deseja inserir outro time (s/n) ? _s_
>
>
>
> Qual o nome do time? _Atletico MG_
>
> Qual o numero de vitorias? _20_
>
> Qual o numero de empates? _6_
>
> Qual o numero de derrotas? _11_
>
> Qual o numero de gols pro? _62_
>
> Qual o numero de gols contra? _47_
>
> Deseja inserir outro time (s/n) ? _n_

Ao final da inserção dos dados o aplicativo deve exibir as opções. Que serão disponibilizadas para o usuário: Saber o nome do time campeão, o nome do lanterna, e exibir a tabela de pontuação ordenada.

Exemplo:
> Selecione uma operação
>
> [1] Saber o campeão
>
> [2] Saber o lanterna
>
> [3] Exibir tabela
>
> _1_
>
> O campeão é o Corinthians
