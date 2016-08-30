Feature: Apresentação da Mensagem 

Scenario: Mensagem Formatada 
  Given o repositório com a mensagem: 
    | id | categoria | autor | texto |
    |  1 | Categoria | Autor | Texto |
  When o usuário executa a aplicação com o comando "pretty". 
  Then a seguinte mensagem é exibida: 
    """
    Categoria: "Texto" por Autor
    """ 
