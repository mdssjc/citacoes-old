Feature: Mensagem no Terminal

Scenario: Mensagem Simples
  Given o repositório com 1 mensagem.
  When o usuário executa a aplicação.
  Then a mensagem é exibida.
