$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/github/mdssjc/citacoes/base/mensagem-no-terminal.feature");
formatter.feature({
  "line": 1,
  "name": "Mensagem no Terminal",
  "description": "",
  "id": "mensagem-no-terminal",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Mensagem Simples",
  "description": "",
  "id": "mensagem-no-terminal;mensagem-simples",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "o repositório inicia.",
  "rows": [
    {
      "cells": [
        "id",
        "categoria",
        "texto",
        "autor"
      ],
      "line": 5
    },
    {
      "cells": [
        "1",
        "Categoria",
        "Mensagem...",
        "Autor"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "o usuário executa a aplicação por 1 vez(es).",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "a mensagem é exibida.",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 9,
    "value": "1.Categoria: \"Mensagem...\" (Autor)"
  }
});
formatter.match({
  "location": "MensagemNoTerminalStepsdef.o_repositório_inicia(Quote\u003e)"
});
formatter.result({
  "duration": 279182882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 34
    }
  ],
  "location": "MensagemNoTerminalStepsdef.o_usuário_executa_a_aplicação_por_vez_es(int)"
});
formatter.result({
  "duration": 88592263,
  "status": "passed"
});
formatter.match({
  "location": "MensagemNoTerminalStepsdef.a_mensagem_é_exibida(String\u003e)"
});
formatter.result({
  "duration": 9588293,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Mensagens Aleatórias",
  "description": "",
  "id": "mensagem-no-terminal;mensagens-aleatórias",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "o repositório inicia.",
  "rows": [
    {
      "cells": [
        "id",
        "categoria",
        "texto",
        "autor"
      ],
      "line": 15
    },
    {
      "cells": [
        "1",
        "A",
        "mensagemA",
        "autorA"
      ],
      "line": 16
    },
    {
      "cells": [
        "2",
        "B",
        "mensagemB",
        "autorB"
      ],
      "line": 17
    },
    {
      "cells": [
        "3",
        "C",
        "mensagemC",
        "autorC"
      ],
      "line": 18
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "o usuário executa a aplicação por 3 vez(es).",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "a mensagem é exibida.",
  "rows": [
    {
      "cells": [
        "1.A: \"mensagemA\" (autorA)"
      ],
      "line": 21
    },
    {
      "cells": [
        "2.B: \"mensagemB\" (autorB)"
      ],
      "line": 22
    },
    {
      "cells": [
        "3.C: \"mensagemC\" (autorC)"
      ],
      "line": 23
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MensagemNoTerminalStepsdef.o_repositório_inicia(Quote\u003e)"
});
formatter.result({
  "duration": 2829811,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 34
    }
  ],
  "location": "MensagemNoTerminalStepsdef.o_usuário_executa_a_aplicação_por_vez_es(int)"
});
formatter.result({
  "duration": 4094330,
  "status": "passed"
});
formatter.match({
  "location": "MensagemNoTerminalStepsdef.a_mensagem_é_exibida(String\u003e)"
});
formatter.result({
  "duration": 564920,
  "status": "passed"
});
});