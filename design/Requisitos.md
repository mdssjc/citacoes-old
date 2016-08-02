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

Gerenciamento de ideias como o **5WH2**:

What (O quê?): um aplicativo de visualização de mensagens;

Why (Porquê?): para disponibilizar mensagens com valor intelectual;

Who (Quem?): a todos os interessados;

When (Quando?): com o ciclo de vida do estudo;

Where (Onde?): nas variadas plataformas, como: Desktop, Mobile e Web;

How (Como?): por software em Java e Linux; e

How Much (Quanto custa?): por ser acadêmico, logo é irrelevante.
