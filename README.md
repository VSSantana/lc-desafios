## Enunciado do Desafio 1

Escreva um algoritmo que receba um parâmetro String.

Verificar se há 3 letras "X" em sequência entre dois números que somam 8.
Exemplo: frdts2XXX6xxbl2XXXeee5

Retorna true pois a String possui a combinação "2XXX6" (Sequencia de 3 "X" entre os números 6 e 2 que somam 8).

# Checklist do Desafio 1

- Algoritmo com parâmetro STRING: OK
- Verificar se entre dois números que somam 8 existem três letras "X" (maiúsculas): OK
- Retornar um boleano: OK

# Enunciado do Desafio 2

Crie um programa que recebe duas listas de números separadas por vírgula. Criar uma terceira lista para unir as duas listas recebidas, eliminando os itens repetidos. Imprimir a lista final em ordem decrescente.

Entrada: Lista 1 => 1,2,3,4
Lista 2 => 2,5

Saida: 5,4,3,2,1

# Checklist do Desafio 2

- Input de duas listas de inteiros separadas por vírgula: OK
- Criar lista concatenada das duas passadas: OK
- Eliminar numeros repetidos da lista concatenada: OK
- Ordenar lista em ordem decrescente: OK
- Imprimir a lista concatenada e ordenada: OK

# Enunciado do Desafio 3

Crie um programa que receba dois numeros como parametro e escreva todos os numeros do intervalo (ordem crescente) e tambem a soma.

Entrada: 3 1

Saida: 1, 2, 3 Soma: 5

Entrada: 2 6

Saida: 2,3,4,5,6 Soma: 20

NAO USAR: Collections, Arrays, metodos utilitarios sort

# Checklist do Desafio 3

- Parâmetros de entrada: dois números inteiros: OK
- Escrever todos os números inteiros entre o menor e o maior: OK
- Somar todos os números apresentados na saída: OK
- Apresentar a soma de todos os números da saída: OK

# To-Do - Desafio 3

- Melhorar a entrada manual de números depois da chamada do programa.

# Enunciado do Desafio 4

Una dois arrays de inteiros em um unico array

Regras:

- Nao é permitido uso de Collections ou java.util.Arrays
- Nao é permitido uso de arrays temporários, com exceçao do arrayConsolidado

Ex.: ENTRADA

- [1, 3, 5, 7]
- [2, 4, 6, 8, 12, 15]

SAIDA

- [1, 2, 3, 4, 5, 6, 7, 8, 12, 15]

# Checklist do Desafio 4

- Unir dois arrais de inteiros em um array consolidado: OK
- Imprimir o array consolidado na saída: OK

# To-Do - Desafio 4

- Melhorar a entrada e a saída dos dados.

# Enunciado do Dessafio 5

Criar um programa que converta moedas. Dado um número limitado de conversões:

USD - AUD: 1.44
USD - BRL: 5.15
BRL - EUR: 0.18
EUR - GBP: 0.86

Encontre a conversão para outras combinações não listadas:

Entrada:

USD - AUD: 1.44
USD - BRL: 5.15
BRL - EUR: 0.18
EUR - GBP: 0.86

GBP - USD

Saida:

GBP - USD: 1.25

# To-Do - Desafio 5

- Melhorar a saída de dados.

# Enunciado do Dessafio 6

O Banco Universal deseja expandir sua área de atuação para oferecer mais opções de investimentos para seus clientes. Para oferecer os produtos de investimento corretos para seus clientes, o banco categorizou os clientes de acordo com seus perfis: Conservador, Arrojado ou Moderado. Assim, por exemplo, o perfil conservador deve adicionar em carteira apenas o tipo Renda Fixa.

Observe o diagrama do desafio 6.

Com base no diagrama e no código disponibilizado, defina a classe abstrata Cliente e as classes-filhas ClienteConservador e ClienteArrojado de forma a fazer o código funcionar. Observe para cumprir a regra de só poder adicionar os produtos de acordo com o perfil do cliente. Caso contrário, deve ocorrer erro de compilação se tentar adicionar um tipo de investimento diferente do previsto para ao perfil do cliente.

# Checklist do Desafio 6

- Criar classe abstrata Cliente: OK
- Criar classe filha ClienteConservador: OK
- Criar classe filha ClienteArrojado: OK
- Adicionar produto de acordo com o perfil do cliente: OK
- Erro de compilação ao adicionar tipo de investimento imcompatível com o perfil do cliente: OK

# Enunciado do Dessafio 7

Crie uma estrutura de classes para simular o envio de uma mensagem por e-mail, mas, antes de enviar a mensagem, disponibilizar diversos tipos de formatações. A mensagem pode ser enviada com nenhuma, uma ou mais de uma das seguintes formatações

Formatar tudo em maiúsculo
Formatar tudo em minúsculo
Formatar em camelCase
Remover acentuação

# Checklist do Desafio 7

- Criar classe Cabecalho: OK
- Criar classe Texto: OK
- Criar classe Envio: OK
- Realizar a formatação no envio (lista com as formatações desejadas): OK

# Enunciado do Dessafio 8

Crie um programa para aplicar uma cadeia de descontos no total da compra.

Os descontos são:

    Se comprar 15 itens ou mais, aplicar 10% de desconto.
    Se comprar 10 itens e menos de 15 aplicar 8% de desconto.
    Se comprar 5 itens e menos de 10 aplicar 5% de desconto.
    Se comprar menos que 5 itens não aplicar desconto.

Ao aplicar o desconto encerre a cadeia de verificações. Deixe o código aberto para que outros tipos de descontos sejam aplicados futuramente.

# Checklist do Desafio 8

- Desconto no valor total da compra, segundo regra: OK
- Aplicação de desconto encerra a cadeia de verificações: OK
- Permitir que o código possa ser incrementado para inclusão de novos descontos: OK
- Implementar método simples cuja chamada recebe o número de itens e o valor total: OK

# Enunciado do Desafio 9

A agência de turismo Brasil Adentro contratou você para desenvolver parte do seu novo site de viagens. A agência possui contrato para vender apenas alguns trechos de voo domésticos e precisa de um programa que calcule todas as rotas possíveis.

O mapa a seguir mostra quais trechos podem ser comercializados pela agência.

A seguinte interface foi definida como contrato para você desenvolver seu código:

public interface Travel {
boolean isReachable(String from, String to, int numberConnections);
}

Ou seja, dada uma cidade de origem, uma de destino e a quantidade de conexões, é possível realizar a viagem?

Entrada:

travel.isReachable("GRU", "REC", 0)

Saída:

true

Entrada:

travel.isReachable("POA", "REC", 1)

Saída:

false

# To-Do do Desafio 9

- Existe uma falha de projeto que não faz com que todos os caminhos possíveis sejam averiguados. Possível solução é alterar a busca para procurar o menor caminho.

# Enunciado do Desafio 11

A partir de uma lista de pessoas (nome e data nascimento no formato dd-MM-yy), calcular a idade de cada pessoa em referência a data de hoje.

A idade maxima das pessoas é de 99 anos.

# Checklist do Desafio 11

- Criar uma lista de pessoas com nome e data de nascimento no formato (dd-MM-yy): OK
- Calcular a idade de cada pessoa em referencia a data de hoje: OK
- Caso a idade seja maior que 99 anos é considerado que a pessoa está no século atual: OK

# Enunciado do Desafio 12

Um funcionário recebe uma comissão de 0.5% sobre o valor do seu dia trabalhado.

Criar uma função para receber o valor do salário mensal e o ano e partir dessas informações calcular a previsão do salário mês a mês.

Considerar apenas os dias úteis (segunda a sexta).

- A diária muda de acordo com o número de dias úteis no mês.

# Checklist do Desafio 12

- Função que recebe o valor mensal do salário e o ano e retorna o salário de cada mês: OK
- Descobrir os dias úteis em um mês: OK
- A função considera apenas os dias úteis: OK
- O valor da diária considera os dias úteis: OK

# Enunciado do Desafio 13

Vai acontecer um evento internacional com transmissão online em São Paulo e Paris.

Começa no dia 20 de Julho às 10h de São Paulo, mas deverá ter uma nova sessão a cada 10 dias.

A cada sessão a hora de início deve avançar 2 horas, comparado com a sessão anterior.

Cada sessão vai durar 6h.

O evento termina no fim de Outubro.

# Checklist Desafio 13

- Crie a agenda do evento programaticamente utilizando o Java Time: OK
- A agenda das sessões para cada lugar: OK
- Com o número da sessão: OK
- Apresentar a data de cada sessão: OK
- O horário de início e de fim, para cada lugar respectivamente: OK
- Apresentar o dia da semana em português: OK
- Organizar o código em classes e adotar algum padrão de projeto (ESSE DEVERIA TER SIDO O PRIMEIRO REQUISITO!): OK (BODY BUILDER)

# Enunciado do Desafio 14

Há um jardim cheio de lírios.

Tem 100 vermelhos, 50 amarelos e 25 azuis, todos bem misturadas, produzindo um efeito bem colorido.

Assuma que o lírio vermelho é o número 1, o amarelo o número 2 e o azul será o número 3.

# Checklist Desafio 14

- Inicialize um stream com as sequências onde cada número representa uma flor: OK

- Misture tudo (flores): OK

- Faça a colheita de todas as flores azuis: OK

- Faça a colheita de 25% das outras flores: OK

- Apresente o total de flores que sobram no jardim: OK

- Utilize apenas stream, é proibido utilizar arrays e collections: OK

# Enunciado do Desafio 15

Baseado na lista de contatos abaixo, obtenha os nomes de quem possuí o número 7 no seu número de telefone e liste os respectivos nomes em ordem alfabéntica.

Apensa utilizando Stream.

List.of(
Map.of("nome", "João", "telefone", "9329823423"),
Map.of("nome", "Maria", "telefone", "9124235435"),
Map.of("nome", "Marta", "telefone", "9456335387"),
Map.of("nome", "José", "telefone", "9632874738"),
Map.of("nome", "Judas", "telefone", "9329244683")
)

# Checklist do Desafio 15

- Obter nome de quem tem 7 no número de telefone:
- Listar os nomes obtidos em ordem alfabética:
- Só utilizar streams:
