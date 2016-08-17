Feature: Mensagem no Terminal 

Scenario: Mensagem Simples 
  Given o repositório inicia. 
    | id | categoria | autor | mensagem |
    |  1 | categoria | autor | mensagem |
  When o usuário executa a aplicação por 1 vez(es). 
  Then a mensagem é exibida. 
    | id | categoria | autor | mensagem |
    |  1 | categoria | autor | mensagem |
    
Scenario: Mensagens Aleatórias 
  Given o repositório inicia. 
    | id | categoria | autor | mensagem |
    |  1 |     A     | autor | mensagem |
    |  2 |     B     | autor | mensagem |
    |  3 |     C     | autor | mensagem |
  When o usuário executa a aplicação por 3 vez(es). 
  Then a mensagem é exibida. 
    | id | categoria | autor | mensagem |
    |  1 |     A     | autor | mensagem |
    |  2 |     B     | autor | mensagem |
    |  3 |     C     | autor | mensagem |
