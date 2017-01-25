Feature: Apresentação da Mensagem 

Scenario: Mensagem Formatada 
  Given o repositório com a mensagem: 
    | id | categoria | texto | autor |
    |  1 | Categoria | Texto | Autor |
  When o usuário executa a aplicação com o comando "pretty". 
  Then a seguinte mensagem é exibida: 
    """
    1.Categoria: "Texto" (Autor)
    """ 
