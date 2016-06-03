# Citações #

## O que é? ##

O aplicativo Citações é um software para a visualização de frases, tais como: provérbio, ditado popular, sabedoria e etc...

## Requisitos ##

O software Citações é um aplicativo para visualização de frases em qualquer plataforma, tais como: Desktop, Web e Mobile - preferência no uso do Linux e Java.
Essas armazenadas em um repositório local de dados com a possibilidade de sincronização, quando executando em offline, com o repositório central - servidor da aplicação.
Cada frase é exibida aleatoriamente na tela, conforme pressionado a opção de próxima citação, composta pelo: autor, citação e sua categoria.

A primeira versão será em desktop, com o desenvolvimento da aplicação em linha de comando.

Módulos principais: Persistência, Base e Interface Gráfica.

- Base da antiga versão em MMB.
- Utilizar as seguintes tecnologias Java, Linux e SQL.
- A camada BASE funciona em linha de comando.
- A camada PERSISTENCE conecta ao banco de dados, sua interface via I/O com a BASE.
  - Candidato para uso: Berkeley DB (possibilidade para sincronização com a web).
- A camada VIEW, inicialmente, possui uma interface gráfica através do JavaFX.

## Modelagem ##

- Diagramas de cenário: contexto e caso de uso.
 - Contexto.
 - Caso de Uso.
