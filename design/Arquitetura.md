# User Stories #

## Mensagem no Terminal ##

Como um usuário da aplicação

Eu Quero requisitar a uma nova mensagem

Para Que seja possível ver uma mensagem aleatoriamente no terminal com os dados de autor, categoria e texto

### Tasks ###

  * Criar a entidade da mensagem com: autor, categoria e texto.
  * Criar um repositório de dados com a estrutura de mapa.
  * Realizar a leitura da mensagem no repositório de dados.
  * Selecionar uma mensagem aleatoriamente.
  * Apresentar a mensagem na tela.

### Test Criteria ###

  * Simular um conjunto de mensagens {A, B, C}.
  * Invocar o ponto de entrada da aplicação.
  * Verificar as mensagens com o conjunto em modo aleatório.

## Apresentação da Mensagem ##

Como um usuário da aplicação

Eu Quero visualizar a mensagem formatada

Para Que possa a corresponder com o padrão: `Categoria: "Mensagem" por Autor`

### Tasks ###

  * Requisitar uma mensagem pelo argumento `pretty`.
  * Formatar a mensagem, conforme o padrão.
  * Apresentar a mensagem na tela.

### Test Criteria ###

  * Simular uma mensagem.
  * Invocar a aplicação com o argumento `pretty`.
  * Comparar a formatação com a mensagem.

## Leitura do JSON/XML ##

## Inclusão de Mensagens ##

## Sincronização do Repositório ##
