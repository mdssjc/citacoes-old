# Requisitos #

O *software* Citações é um aplicativo para visualização de mensagens do dia a dia, disponível em qualquer plataforma, tais como: *Desktop*, *Mobile* e *Web* - na preferência pelo uso de tecnologias livres como: *Java* e *Linux*.

Essas são armazenadas em um repositório local de dados com a possibilidade de sincronização, quando executado em *offline*, com o repositório central - servidor da aplicação.

A citação é exibida aleatoriamente na tela, conforme ação do usuário em escolher a opção de próxima mensagem, composta por: autor, mensagem e sua categoria (provérbio, ditado popular, sabedoria, frases e etc...) - um arquivo com a sumarização dos dados estatísticos sobre a visualização das citações é criado.

Além da visualização, tem a possibilidade de integração com serviços de mensagens como o *Twitter* e o *Facebook*.

A parte principal do aplicativo é sua **base** em que coordena as atividades das funcionalidades principais para interação entre visualização e repositório, quando na versão:

- **Desktop**: a **base** recupera a mensagem do repositório local e encaminha para o **view**. A **base** é um módulo em linha de comando e a **view** é uma interface gráfica - preferência no uso do *JavaFX*. Existe a possibilidade de sincronização das frases com um repositório remoto, via *Internet*. Toda comunicação deve optar por um protocolo em texto, como *XML* ou *JSON*.
- **Mobile**: ASD (A Ser Definido); e
- **Web**: ASD (A Ser Definido).

## Questões ##

*What* (O quê?): desenvolver um sistema multiplataforma para visualização de mensagens em paralelo com os estudos;

*Why* (Porquê?): para aplicar conhecimentos sobre arquitetura de *software* e testes, além de disponibilizar mensagens com valor intelectual;

*Who* (Quem?): aos interessados em desenvolvimento de *software* e em aplicativos de mensagens;

*When* (Quando?): com o ciclo de vida dos estudos;

*Where* (Onde?): no escritório com a exposição dos materiais através de mídias sociais: *Github* e *Twitter*;

*How* (Como?): através dos estudos e incrementos do portfólio; e

*How Much* (Quanto custa?): por ser um projeto acadêmico, logo é irrelevante o fator material.
