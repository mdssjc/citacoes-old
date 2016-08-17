package com.github.mdssjc.citacoes.base;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * Etapas do cenário: Mensagem no Terminal.
 * 
 * @author Marcelo dos Santos
 *
 */
public class MensagemNoTerminalStepsdef implements En {

  public MensagemNoTerminalStepsdef() {
    Given("^o repositório inicia\\.$", (final DataTable arg1) -> {
      // Write code here that turns the phrase above into concrete actions
      // For automatic transformation, change DataTable to one of
      // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
      // E,K,V must be a scalar (String, Integer, Date, enum etc)
      throw new PendingException();
    });

    When("^o usuário executa a aplicação por (\\d+) vez\\(es\\)\\.$",
        (final Integer arg1) -> {
          // Write code here that turns the phrase above into concrete actions
          throw new PendingException();
        });

    Then("^a mensagem é exibida\\.$", (final DataTable arg1) -> {
      // Write code here that turns the phrase above into concrete actions
      // For automatic transformation, change DataTable to one of
      // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
      // E,K,V must be a scalar (String, Integer, Date, enum etc)
      throw new PendingException();
    });
  }
}
