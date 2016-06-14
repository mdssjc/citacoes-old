# Citações #

## O que é? ##

O aplicativo Citações é um software para a visualização de frases, tais como: provérbio, ditado popular, sabedoria e etc...

## Requisitos ##

O software Citações é um aplicativo para visualização de frases em qualquer plataforma, tais como: Desktop, Web e Mobile - preferência no uso do Linux e Java.
Essas são armazenadas em um repositório local de dados com a possibilidade de sincronização, quando executado em offline, com o repositório central - servidor da aplicação.
Cada frase é exibida aleatoriamente na tela, conforme pressionado a opção de próxima citação, composta pelo: autor, citação e sua categoria - um log com dados estatísticos sobre a visualização das citações é criado.
A parte principal do aplicativo é sua Base, na qual são encontradas as funcionalidades principais para interação com o repositório, quando na versão:
- Desktop: a Base recupera a frase do repositório local - preferência no uso do Berkeley DB - e encaminha para o View. A Base é um módulo em linha de comando e a View é uma interface gráfica - preferência no uso do JavaFX. Existe a possibilidade de sincronização das frases com um repositório remoto, via Internet.
- Web: ASD (A Ser Definido); e
- Mobile: ASD (A Ser Definido).

## Modelagem ##

### Contexto ###

Na primeira versão (desktop) não possui a complexidade para a visão de múltiplos sistemas.
Não há necessidade da modelagem do contexto.

### Interação ###

#### Caso de Uso ####
