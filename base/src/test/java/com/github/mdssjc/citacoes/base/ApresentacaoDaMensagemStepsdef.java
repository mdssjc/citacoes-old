package com.github.mdssjc.citacoes.base;

import static org.junit.Assert.fail;

import java.util.List;

import com.github.mdssjc.citacoes.model.Mensagem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Especificação: Apresentação da Mensagem.
 * 
 * @author Marcelo dos Santos
 *
 */
public class ApresentacaoDaMensagemStepsdef {

  @Given("^o repositório com a mensagem:$")
  public void o_repositório_com_a_mensagem(List<Mensagem> mensagens) {
    fail();
  }

  @When("^o usuário executa a aplicação com o comando \"([^\"]*)\"\\.$")
  public void o_usuário_executa_a_aplicação_com_o_comando(String comando) {
    fail();
  }

  @Then("^a seguinte mensagem é exibida:$")
  public void a_seguinte_mensagem_é_exibida(String saida) throws Throwable {
    fail();
  }
}
