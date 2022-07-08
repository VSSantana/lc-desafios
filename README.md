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

- Criar classe abstrata Cliente:
- Criar classe filha ClienteConservador:
- Criar classe filha ClienteArrojado:
- Adicionar produtor de acordo com o perfil do cliente:
- Erro de compilação ao adicionar tipo de investimento imcompatível com o perfil do cliente:
