# Requisitos #

O *software* Citações é um aplicativo para visualização de mensagens no dia a dia em qualquer tipo de plataforma, tais como: *Desktop*, *Mobile* e *Web* - na preferência pelo uso da tecnologia *Java* e *Linux*.

Essas são armazenadas em um repositório local de dados com a possibilidade de sincronização, quando executado em *offline*, com o repositório central - servidor da aplicação.

A mensagem é exibida aleatoriamente na tela, conforme pressionado a opção de próxima citação, composta pelo: autor, citação e sua categoria (provérbio, ditado popular, sabedoria, frases e etc...) - um *log* com dados estatísticos sobre a visualização das citações é criado.

Além da visualização, tem a integração com serviços de mensagens como *Twitter* e *Facebook*.

A parte principal do aplicativo é sua **base** em que coordena as atividades das funcionalidades principais para interação com o repositório, quando na versão:

- **Desktop**: a **base** recupera a frase do repositório local - preferência no uso do *Berkeley DB* - e encaminha para o **view**. A **base** é um módulo em linha de comando e a **view** é uma interface gráfica - preferência no uso do *JavaFX*. Existe a possibilidade de sincronização das frases com um repositório remoto, via *Internet*.
- **Mobile**: ASD (A Ser Definido); e
- **Web**: ASD (A Ser Definido).
