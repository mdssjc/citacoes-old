# Citações #

## O que é? ##

O aplicativo Citações é um software para a visualização de frases, tais como: provérbio, ditado popular, sabedoria e etc...

## Requisitos ##

O software Citações é um aplicativo para visualização de frases em qualquer plataforma, tais como: Desktop, Web e Mobile - preferência no uso do Linux e Java.
Essas são armazenadas em um repositório local de dados com a possibilidade de sincronização, quando executando em offline, com o repositório central - servidor da aplicação.
Cada frase é exibida aleatoriamente na tela, conforme pressionado a opção de próxima citação, composta pelo: autor, citação e sua categoria.
Quando na versão Desktop um módulo de Base obtém as frases do repositório e encaminha para um módulo de View como interface gráfica - preferência JavaFX.


A primeira versão será em desktop, com o desenvolvimento da aplicação em linha de comando.

Módulos principais: Persistência, Base e Interface Gráfica.

- A camada BASE funciona em linha de comando.
- A camada PERSISTENCE conecta ao banco de dados, sua interface via I/O com a BASE.
  - Candidato para uso: Berkeley DB (possibilidade para sincronização com a web).

## Modelagem ##

- Diagramas de cenário: contexto e caso de uso.
 - Contexto.
 - Caso de Uso.
