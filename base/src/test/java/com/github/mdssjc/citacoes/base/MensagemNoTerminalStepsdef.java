package com.github.mdssjc.citacoes.base;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.github.mdssjc.citacoes.model.Mensagem;

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

  private List<String> saidas;

  @Given("^o repositório inicia\\.$")
  public void o_repositório_inicia(final List<Mensagem> mensagens) {
    this.saidas = new ArrayList<>();

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
  public void o_usuário_executa_a_aplicação_por_vez_es(final int vezes) {
    fail("Não implementado");
    try {
      for (int i = 0; i < vezes; i++) {
        System.setOut(new PrintStream(new File("log")));
        Main.main(new String[] { "" });
        this.saidas = Files.readAllLines(Paths.get("log"));
      }
    } catch (final IOException exception) {
      System.err.println("Falha na execução: " + exception.getMessage());
    }
  }

  @Then("^a mensagem é exibida\\.$")
  public void a_mensagem_é_exibida(final List<Mensagem> referencias) {
    fail("Não implementado");

    final List<Mensagem> mensagens = new ArrayList<>();
    for (int i = 0; i < this.saidas.size(); i += 4) {
      final Mensagem mensagem = new Mensagem();
      mensagem.setId(Long.parseLong(this.saidas.get(i)));
      mensagem.setCategoria(this.saidas.get(i + 1));
      mensagem.setAutor(this.saidas.get(i + 2));
      mensagem.setTexto(this.saidas.get(i + 3));
      mensagens.add(mensagem);
    }

    for (final Mensagem mensagem : mensagens) {
      referencias.contains(mensagem);
      referencias.remove(mensagem);
    }
  }
}
