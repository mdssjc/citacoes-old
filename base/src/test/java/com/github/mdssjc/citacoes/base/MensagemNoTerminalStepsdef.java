package com.github.mdssjc.citacoes.base;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import com.github.mdssjc.citacoes.model.Mensagem;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Etapas do cenário: Mensagem no Terminal.
 * 
 * @author Marcelo dos Santos
 *
 */
public class MensagemNoTerminalStepsdef {

  @Given("^o repositório inicia\\.$")
  public void o_repositório_inicia(final List<Mensagem> mensagens) {
    try (PrintStream ps = new PrintStream(new File("repositorio"))) {
      for (final Mensagem mensagem : mensagens) {
        ps.println(mensagem.getId());
        ps.println(mensagem.getCategoria());
        ps.println(mensagem.getAutor());
        ps.println(mensagem.getTexto());
      }
    } catch (final IOException exception) {
      System.err
        .println(
            "Falha na criação do repositório: " + exception.getMessage());
      fail();
    }
  }

  @When("^o usuário executa a aplicação por (\\d+) vez\\(es\\)\\.$")
  public void o_usuário_executa_a_aplicação_por_vez_es(final int arg1) {
    fail("Não implementado");
  }

  @Then("^a mensagem é exibida\\.$")
  public void a_mensagem_é_exibida(final DataTable arg1) {
    fail("Não implementado");
  }
}
