# Citações #

## O que é? ##

O aplicativo Citações é um software para a visualização de frases, tais como: provérbio, ditado popular, sabedoria e etc...

## Requisitos ##

*Descrever os objetivos de alto nível do aplicativo.*

O software Citações é um aplicativo para visualização de frases, essas armazenadas em um repositório central de dados (módulo PERSISTENCE). Cada frase é exibida aleatoriamente na tela, conforme pressionado a opção de próxima citação, composta pelo autor, citação e sua categoria. As frases podem ser visualizadas de diversas forma de mídia, tais como: web, mobile e desktop.

Módulos principais: Persistência, Base e Interface Gráfica.

- Base da antiga versão em MMB.
- Utilizar as seguintes tecnologias Java, Linux e SQL.
- A camada BASE funciona em linha de comando.
- A camada PERSISTENCE conecta ao banco de dados, sua interface via I/O com a BASE.
  - Candidato para uso: Berkeley DB.
- A camada VIEW, inicialmente, possui uma interface gráfica através do JavaFX.

## Modelagem ##

- Diagramas de cenário: contexto e caso de uso.
