Feature: Mensagem no Terminal 

Scenario: Mensagem Simples 
  Given o repositório inicia. 
    | id | categoria | texto       | autor |
    |  1 | Categoria | Mensagem... | Autor |
  When o usuário executa a aplicação por 1 vez(es). 
  Then a mensagem é exibida. 
    """
    1.Categoria: "Mensagem..." (Autor)
    """

Scenario: Mensagens Aleatórias
  Given o repositório inicia.
    | id | categoria |  texto    | autor  |
    |  1 |     A     | mensagemA | autorA |
    |  2 |     B     | mensagemB | autorB |
    |  3 |     C     | mensagemC | autorC |
  When o usuário executa a aplicação por 3 vez(es).
  Then a mensagem é exibida.
    |1.A: "mensagemA" (autorA)|
    |2.B: "mensagemB" (autorB)|
    |3.C: "mensagemC" (autorC)|
