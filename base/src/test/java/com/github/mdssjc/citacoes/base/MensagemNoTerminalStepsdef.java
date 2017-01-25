package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.entities.Quote;
import com.github.mdssjc.citacoes.utils.Config;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.fail;

/**
 * Especificação: Mensagem no Terminal.
 *
 * @author Marcelo dos Santos
 *
 */
public class MensagemNoTerminalStepsdef {

  private List<String> saidas;

  @Given("^o repositório inicia\\.$")
  public void o_repositório_inicia(final List<Quote> mensagens) {
    Config.INSTANCE.testMode();
    this.saidas = new ArrayList<>();

    try (PrintStream ps = new PrintStream(new File("repositorio"))) {
      for (final Quote mensagem : mensagens) {
        ps.printf("%d.%s: \"%s\" (%s)%n",
                  mensagem.getId(),
                  mensagem.getCategoria(),
                  mensagem.getTexto(),
                  mensagem.getAutor());
      }
    } catch (final IOException exception) {
      fail("Falha ao ciar o repositório: " + exception.getMessage());
    }
  }

  @When("^o usuário executa a aplicação por (\\d+) vez\\(es\\)\\.$")
  public void o_usuário_executa_a_aplicação_por_vez_es(final int vezes) {
    try (PrintStream ps = new PrintStream(new File("log"))) {
      System.setOut(ps);
      for (int i = 0; i < vezes; i++) {
        Main.main(new String[]{});
      }
      this.saidas = Files.readAllLines(Paths.get("log"));
      this.saidas.removeIf(String::isEmpty);
    } catch (final IOException exception) {
      fail("Falha ao executar a aplicação: " + exception.getMessage());
    }

    if (this.saidas.size() != vezes) {
      fail("Faltam mensagens durante a execução.");
    }
  }

  @Then("^a mensagem é exibida\\.$")
  public void a_mensagem_é_exibida(final List<String> referencias) {
    if (referencias.size() != this.saidas.size()) {
      fail("Incoerência na quantidade de mensagens.");
    }

    final List<Quote> mensagens = this.saidas.stream()
                                             .map(Quote::of)
                                             .collect(Collectors.toList());

    for (final String referencia : referencias) {
      if (mensagens.contains(Quote.of(referencia))) {
        fail("Mensagem não encontrada.");
      }
    }
  }
}
